package com.rest.webservices.restfulwebservices.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.webservices.restfulwebservices.jpa.UserRepository;

@Component
public class UserDaoService {

	
	@Autowired
	private UserRepository repository;
	
	//private static int userCount =0;
	//Creating Static List
	//private static List<User> users = new ArrayList<>();
	/*
	 * static { users.add(new User(++userCount, "K1tte",
	 * LocalDate.now().minusYears(30))); users.add(new User(++userCount, "1Eve",
	 * LocalDate.now().minusYears(20))); users.add(new User(++userCount, "1Jim",
	 * LocalDate.now().minusYears(25))); }
	 */
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findUser(int id) {
		List<User> alluser = repository.findAll();
		for(User user : alluser) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	public void save(User userDetails) {
		//userDetails.setId(userCount);
		//users.add(userDetails);
		repository.save(userDetails);
	}
}
