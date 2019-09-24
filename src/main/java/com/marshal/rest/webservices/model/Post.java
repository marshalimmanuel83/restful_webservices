package com.marshal.rest.webservices.model;

import java.util.Date;

public class Post {
	
	private Integer id;
	private String postMessage;
	private Date postDate;
	
	// default 'no-arg' constructor
	protected Post() {}
	
	/**
	 * @param id
	 * @param postMessage
	 * @param postDate
	 */
	public Post(Integer id, String postMessage, Date postDate) {
		this.id = id;
		this.postMessage = postMessage;
		this.postDate = postDate;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPostMessage() {
		return postMessage;
	}
	
	public void setPostMessage(String postMessage) {
		this.postMessage = postMessage;
	}
	
	public Date getPostDate() {
		return postDate;
	}
	
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", postMessage=" + postMessage + ", postDate=" + postDate + "]";
	}
	
}