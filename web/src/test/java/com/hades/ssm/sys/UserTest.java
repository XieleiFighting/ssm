package com.hades.ssm.sys;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hades.ssm.model.entity.User;
import com.hades.ssm.model.service.UserService;
import com.hades.ssm.test.BaseTest;

public class UserTest extends BaseTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testFindById() {
		try {
			User user = userService.findById(1L);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
