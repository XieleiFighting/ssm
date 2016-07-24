package com.hades.ssm.model.service;

import com.hades.ssm.model.entity.User;

import java.util.List;

public interface UserService {
	
	User saveUser(User user);

	User findUserByUsername(String username);
	User findUserById(Long id);
	List<User> getAllUsers();
}
