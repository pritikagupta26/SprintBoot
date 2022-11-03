package com.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method= RequestMethod.GET, path = "/hello-world")
	public String helloWOrld() {
		
		return "Hello World";
	}
	
	@RequestMapping(method= RequestMethod.GET, path = "/hello-world/path-variable/{message}/{name}")
	public String helloWorldPathVariable(@PathVariable String message, @PathVariable String name) {
		
		return "Hello World" + message+ name;
	}
	@RequestMapping(method= RequestMethod.GET, path = "/hello-world-Bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello World");
	}


}
