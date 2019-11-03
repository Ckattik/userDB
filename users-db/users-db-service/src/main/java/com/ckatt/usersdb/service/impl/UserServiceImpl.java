package com.ckatt.usersdb.service.impl;

import java.util.List;

import com.ckatt.usersdb.dao.UserDao;
import com.ckatt.usersdb.dao.domain.User;
import com.ckatt.usersdb.dao.jdbc.UserDaoImpl;
import com.ckatt.usersdb.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public List<User> getAllUsers() {
		UserDao userDao = new UserDaoImpl();
		return userDao.loadAllUsers();
	}

	@Override
	public User getUserById(Integer userId) {
		UserDao userDao = new UserDaoImpl();
		return userDao.loadUserById(userId);
	}

	@Override
	public User getUserByUserName(String userName) {
		UserDao userDao = new UserDaoImpl();
		return userDao.loadUserByUserName(userName);
	}

	@Override
	public Integer saveUser(User user) {
		UserDao userDao = new UserDaoImpl();

		if (user.getId() == null) {
			return userDao.storeUser(user);
		}

		userDao.updateUser(user);
		return user.getId();
	}

	@Override
	public void deleteUser(Integer userId) {
		UserDao userDao = new UserDaoImpl();
		userDao.deleteUser(userId);
	}
}

