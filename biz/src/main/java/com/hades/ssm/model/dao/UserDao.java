package com.hades.ssm.model.dao;

import com.hades.ssm.model.entity.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);
    User getUserByUsername(String username);
    List<User> getAllUsers();
}