package com.marshal.rest.webservices.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.marshal.rest.webservices.model.User;
import com.marshal.rest.webservices.service.UserDAOService;

@RestController
public class UserController {
	
	@Autowired
	private UserDAOService daoService;
	
	// get all the users
	@GetMapping(path="/users")
	public List<User> getUsers() {
		return daoService.findAllUsers();
	}
	
	// get one user based on given id
	@GetMapping(path="/users/{id}")
	public User getUserById(@PathVariable int id) {
		
		User user = daoService.getUser(id);
		if (user == null) {
			throw new UserNotFoundException("id - " + id);
		}
		
		return user;
	}
	
	// save an user
	@PostMapping(path="/users")
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		User savedUser = daoService.saveUser(user);
		System.out.println("New User: " + savedUser.toString());
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	

}
