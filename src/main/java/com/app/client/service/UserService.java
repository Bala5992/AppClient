package com.app.client.service;

import com.app.client.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	 
	public void saveUser(User user);
}
