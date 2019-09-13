package com.thoughtworks.iflix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.iflix.dto.UserDto;
import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.service.UserService;

@RestController
@RequestMapping("/iflix")
public class UserController 
{
	@Autowired
	UserService userService;
	
	@PostMapping("/userlogin")
	public boolean userlogin(@RequestBody UserLoginDto loginDto) 
	{
		return userService.onLogin(loginDto);
	}
	
	@PostMapping("/createuser")
	public boolean createUser(@RequestBody User user) 
	{
		return userService.onCreate(user);
	}
	
}
