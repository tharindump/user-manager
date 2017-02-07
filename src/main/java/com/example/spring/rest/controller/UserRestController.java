package com.example.spring.rest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.rest.model.Message;
import com.example.spring.rest.model.User;
import com.example.spring.rest.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserRestController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/users/{username}", method = RequestMethod.GET)
	public User getUserDetails(@PathVariable("username") String username) {
		return userService.getUser(username);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public Message addUser(@RequestBody User user) {
		
		Message message = new Message();
		
		if (userService.isUserExist(user.getUsername())) {
			message.setMessage("User already exist, please choose a different username");
		} else {
			userService.addNewUser(user);
			message.setMessage("success");
		}
		return message;
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Collection<User> getAllUsers() {
		return userService.getUsersList();
	}

	@RequestMapping(value = "/users/{username}", method = RequestMethod.DELETE)
	public User deleteUser(@PathVariable("username") String username) {
		return userService.deleteUser(username);

	}

}
