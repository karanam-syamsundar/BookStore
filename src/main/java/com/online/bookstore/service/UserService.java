package com.online.bookstore.service;

import java.util.List;

import com.online.bookstore.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
}
