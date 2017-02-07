package com.example.spring.rest.service;

import java.util.Collection;

import com.example.spring.rest.model.User;

public interface UserService {
	
	public boolean isUserExist(String username);
	public void addNewUser(User user);
	public User getUser(String username);
	public Collection<User> getUsersList();
	public User deleteUser(String username);
	
}
