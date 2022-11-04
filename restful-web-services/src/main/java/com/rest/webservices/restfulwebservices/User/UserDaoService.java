package com.rest.webservices.restfulwebservices.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static int userCount =0;
	//Creating Static List
	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(++userCount, "Katte", LocalDate.now().minusYears(30)));
		users.add(new User(++userCount, "Eve", LocalDate.now().minusYears(20)));
		users.add(new User(++userCount, "Jim", LocalDate.now().minusYears(25)));
	}

	public List<User> findAll(){
		return users;
	}
	
	public User findUser(int id) {
		for(User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	public User save(User userDetails) {
		userDetails.setId(userCount);
		users.add(userDetails);
		return userDetails;
	}
}
