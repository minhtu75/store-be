package com.demo.store.user;

import com.model.user.UserResponse;

public class UserRepository {

	public UserResponse getUserById(long id) {
		UserResponse userResponse = new UserResponse();
		userResponse.setId(id);
		userResponse.setUsername("abc");
		userResponse.setEmail("12345");
		userResponse.setEmail("abc@demo.com");
		
		return userResponse;
	}
}
