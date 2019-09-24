package com.marshal.rest.webservices.model;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {
	
	public HelloWorldBean() {}
	
	/**
	 * @param message
	 */
	public HelloWorldBean(String message) {
		this.message = message;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
}