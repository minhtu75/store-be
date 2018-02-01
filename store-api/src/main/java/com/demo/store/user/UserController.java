package com.demo.store.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.store.UserService;
import com.model.user.UserResponse;

@RestController
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "get/{id}", method = RequestMethod.GET)
	public UserResponse getUserById(@PathVariable("id") long id) {
		return userService.getUserById(id);
	}
	
}
