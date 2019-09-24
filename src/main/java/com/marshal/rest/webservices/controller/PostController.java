package com.marshal.rest.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.marshal.rest.webservices.model.Post;
import com.marshal.rest.webservices.model.User;
import com.marshal.rest.webservices.service.PostDAOService;
import com.marshal.rest.webservices.service.UserDAOService;

/**
 * This class handles request related to Posts.<br>
 * 
 * @author marshal_sudhan
 *
 */
@RestController
public class PostController {

	@Autowired
	private PostDAOService postDAOService;

	@Autowired
	private UserDAOService userDAOService;

	/**
	 * to get all the posts irrespective of user
	 * 
	 * @return List of all posts
	 */
	@GetMapping(path = "/posts")
	public List<Post> getAllPosts() {
		return postDAOService.getAllPosts();
	}

	/**
	 * to get the posts for the given user id in the request header <br>
	 * 
	 * @param id
	 * @return list of posts for the given user id
	 */
	@GetMapping(path = "/users/{id}/posts")
	public List<Post> getUserPosts(@PathVariable int id) {

		List<Post> posts = null;

		if (id == 1) {
			System.out.println("User ID is: " + id);
			posts = postDAOService.getUser1Posts();
			return posts;
		} else if (id == 2) {
			System.out.println("User ID is: " + id);
			posts = postDAOService.getUser2Posts();
			return posts;
		} else {
			System.out.println("User ID is: " + id);
			throw new PostNotFoundException("Post not found for user id: " + id);
		}

	}

}
