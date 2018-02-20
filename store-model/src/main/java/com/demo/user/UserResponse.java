package com.demo.user;

import lombok.Data;

@Data
public class UserResponse 
{
	private long id;

	private String username;

	private String password;

	private String email;
}
