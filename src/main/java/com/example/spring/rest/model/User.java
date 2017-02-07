package com.example.spring.rest.model;

import java.util.Date;

public class User {
	
	private String username;
	private String password;
	private String name;
	private int age;
	private String birthday;
	
	public User() {}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(String username, String name, int age) {
		super();
		this.username = username;
		this.name = name;
		this.age = age;
		this.birthday = new Date().toString();
	}

	public User(String username, String password, String name, int age, String birthday) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
}
