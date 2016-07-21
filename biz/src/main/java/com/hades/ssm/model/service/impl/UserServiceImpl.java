package com.hades.ssm.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hades.ssm.model.dao.UserDao;
import com.hades.ssm.model.entity.User;
import com.hades.ssm.model.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public User findById(Long id) {
		
		return userDao.selectByPrimaryKey(id);
	}

}
