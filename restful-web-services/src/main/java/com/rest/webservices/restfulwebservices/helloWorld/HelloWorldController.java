package com.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method= RequestMethod.GET, path = "/hello-world")
	public String helloWOrld() {
		
		return "Hello World";
	}

}
