package com.airline.controller;

import java.util.ArrayList;

import com.airline.model.PassengerModel;

public class PassengerController {
	static ArrayList<PassengerModel> userregister = new ArrayList<>();

	PassengerModel p = new PassengerModel();   //model

	public boolean userSignup(String name,  String username, String password) {

		userregister.add(new PassengerModel(name,  username, password));
		return true;

	}

	public boolean userLogin(String username, String password) {
		boolean check = false;   
		for (PassengerModel pk : userregister)
		{
			if (pk.getUsername().equals(username) && pk.getPassword().equals(password)) {
				check = true;
			}

		}

		return check;

	}
}