package com.marshal.rest.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marshal.rest.webservices.model.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@Autowired
	public HelloWorldBean helloWorldBean;
	
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world") // this is one way of defining request mapping
	@GetMapping(path="/hello-world") // this is the simplest and advanced way of defining request mapping
	public String helloWorld() {
		return "Hello World";
	}
	
}