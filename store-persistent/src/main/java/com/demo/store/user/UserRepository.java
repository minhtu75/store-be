package com.demo.store.user;

import org.springframework.stereotype.Repository;

import com.model.user.UserResponse;

@Repository
public class UserRepository {

	public UserResponse getUserById(long id) {
		UserResponse userResponse = new UserResponse();
		userResponse.setId(id);
		userResponse.setUsername("abc");
		userResponse.setPassword("12345");
		userResponse.setEmail("abc@demo.com");
		
		return userResponse;
	}
}
