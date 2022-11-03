package com.rest.webservices.restfulwebservices.helloWorld;

public class HelloWorldBean {

	private String message;
	private String name;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", name=" + name + "]";
	}

	
}
