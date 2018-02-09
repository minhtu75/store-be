package com.demo.store.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.store.UserService;
import com.model.user.UserResponse;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserResponse getUserById(long id) {
		return null;
	}
}
