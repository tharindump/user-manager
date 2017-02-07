package com.example.spring.rest.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.spring.rest.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	private static Map<String, User> userMap = new HashMap<>();
	
	//check whether a user exists
	@Override
	public boolean isUserExist(String username) {
		if (userMap.containsKey(username)) {
			return true;
		}
		return false;
	}
	
	//adding new user to the map
	public void addNewUser(User user) {
		userMap.put(user.getUsername(), user);
	}
	
	public Collection<User> getUsersList() {
		return userMap.values();
	}

	@Override
	public User getUser(String username) {
		return userMap.get(username);
	}

	@Override
	public User deleteUser(String username) {
		return userMap.remove(username);
	}
	
}
