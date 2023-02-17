package com.airline.model;

public class PassengerModel {
	String name;
    String username;
	String password;

	

	public PassengerModel(String name,  String username, String password) {

		this.name = name;
		
		this.username = username;
		this.password = password;
	}

	public PassengerModel() {
		
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}