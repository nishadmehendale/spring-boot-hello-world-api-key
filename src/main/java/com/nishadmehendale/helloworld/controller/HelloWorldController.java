package com.nishadmehendale.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nishadmehendale.helloworld.util.RequestValidators;



@RestController
public class HelloWorldController {

	@Autowired
	RequestValidators requestValidators;
	
	@RequestMapping("/hello")
	public String hello(@RequestHeader(value = "api-key", required = false) String apiKey) {
		if(!requestValidators.isValidApiKey(apiKey)) {
			return "ApiKey validation failed";
		}
		return "Hello";
	}
}
