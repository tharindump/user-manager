package com.example.spring.rest.model;

public class Message {
	private String message;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	Message(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
