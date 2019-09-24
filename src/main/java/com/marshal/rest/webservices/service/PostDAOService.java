package com.marshal.rest.webservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.marshal.rest.webservices.model.Post;

@Component
public class PostDAOService {
	
	private static ArrayList<Post> allPosts = new ArrayList<>();
	private static List<Post> user1Posts = new ArrayList<>();
	private static List<Post> user2Posts = new ArrayList<>();
	
	static {
		
		// set posts for user 1
		user1Posts.add(new Post(1, "Message 1 for User 1", new Date()));
		user1Posts.add(new Post(2, "Message 2 for User 1", new Date()));
		user1Posts.add(new Post(3, "Message 3 for User 1", new Date()));
		user1Posts.add(new Post(4, "Message 4 for User 1", new Date()));
		user1Posts.add(new Post(5, "Message 5 for User 1", new Date()));
		
		// set posts for user 1
		user2Posts.add(new Post(1, "Message 1 for User 2", new Date()));
		user2Posts.add(new Post(2, "Message 2 for User 2", new Date()));
		user2Posts.add(new Post(3, "Message 3 for User 2", new Date()));
		user2Posts.add(new Post(4, "Message 4 for User 2", new Date()));
		user2Posts.add(new Post(5, "Message 5 for User 2", new Date()));
		
		allPosts.addAll(user1Posts);
		allPosts.addAll(user2Posts);
		
	}
	
	public ArrayList<Post> getAllPosts() {
		return allPosts;
	}
	
	public List<Post> getUser1Posts() {
		return user1Posts;
	}
	
	public List<Post> getUser2Posts() {
		return user2Posts;
	}
	
	public static void main(String[] args) {
		PostDAOService daoService = new PostDAOService();
		System.out.println(daoService.getAllPosts());
	}

}
