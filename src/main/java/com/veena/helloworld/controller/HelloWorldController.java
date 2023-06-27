package com.veena.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/welcome/{name}")
	public String welcomeUser(@PathVariable String name) {
		
		return "Hello "+name+", welcome to my website!!";
		
	}

}
