package com.marshal.rest.webservices.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.marshal.rest.webservices.model.User;

@Component
public class UserDAOService {

	private static ArrayList<User> users = new ArrayList<>();

	private static int userCount = 3;

	static {

		users.add(new User(1, "Marshal", new Date()));
		users.add(new User(2, "Joel", new Date()));
		users.add(new User(3, "Sudhan", new Date()));

	}

	// find all users
	public ArrayList<User> findAllUsers() {
		return users;
	}

	// find a user for given id
	public User getUser(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	// save a user
	public User saveUser(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
}
