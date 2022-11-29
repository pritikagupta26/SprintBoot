package com.rest.webservices.restfulwebservices;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rest.webservices.restfulwebservices.User.User;
import com.rest.webservices.restfulwebservices.User.UserDaoService;


@SpringBootTest
public class UserDaoServiceTest {

	@Autowired
	UserDaoService userDaoService;
	
	
	@Test
	public void testFindUser() {
		User user = userDaoService.findUser(10001);
		 assertEquals("Katte", user.getName());
	}
	
	@Test
	public void testFindUserNotNull() {
		User user = userDaoService.findUser(10002);
		 assertNotNull(user);;
	}
	@Test
	public void testFindUserNull() {
		User user = userDaoService.findUser(10000);
		 assertNull(user);
	}
}
