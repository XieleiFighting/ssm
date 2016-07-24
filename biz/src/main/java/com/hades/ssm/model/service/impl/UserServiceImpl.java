package com.hades.ssm.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hades.ssm.model.dao.UserDao;
import com.hades.ssm.model.entity.User;
import com.hades.ssm.model.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;


	@Override
	public User saveUser(User user) {
		userDao.saveUser(user);
		return user;
	}

	@Override
	public User findUserByUsername(String username) {
		return userDao.getUserByUsername(username);
	}

	@Override
	public User findUserById(Long id) {
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
}
