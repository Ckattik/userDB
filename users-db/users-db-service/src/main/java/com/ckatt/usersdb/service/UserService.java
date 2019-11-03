package com.ckatt.usersdb.service;

import java.util.List;

import com.ckatt.usersdb.dao.domain.User;

public interface UserService {

	

	List<User> getAllUsers();

	User getUserById(Integer userId);

	User getUserByUserName(String userName);

	Integer saveUser(User user);

	void deleteUser(Integer userId);
}
