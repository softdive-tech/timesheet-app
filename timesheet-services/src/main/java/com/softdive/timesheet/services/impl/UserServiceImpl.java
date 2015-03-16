package com.softdive.timesheet.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softdive.timesheet.core.db.mapper.UserMapper;
import com.softdive.timesheet.model.ApplicationException;
import com.softdive.timesheet.model.User;
import com.softdive.timesheet.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User createUser(User user) throws ApplicationException {
		userMapper.insertUser(user);
		return user;
	}

}
