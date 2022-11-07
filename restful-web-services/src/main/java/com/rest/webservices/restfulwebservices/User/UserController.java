package com.rest.webservices.restfulwebservices.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservices.restfulwebservices.jpa.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserDaoService service;
	
	@RequestMapping(method= RequestMethod.GET, path = "/users")
	public List<User> retriveAllUser(){
		return service.findAll();
	}
	
	@RequestMapping(method= RequestMethod.GET, path = "/user/{id}")
	public User retriveUser(@PathVariable int id){
		return service.findUser(id);
	}
	
	@RequestMapping(method= RequestMethod.POST, path = "/saveuser")
	public void saveUser(@RequestBody User user){
		 service.save(user);
	}
}
