package com.thoughtworks.iflix.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtworks.iflix.dto.UserDto;
import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.exception.UserException;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.repository.IUserRepository;

@Service
public class UserService 
{
	ModelMapper modelMapper=new ModelMapper();
	
	@Autowired
	IUserRepository userRepository;
	
	/**
	 * Method to login
	 */
	public boolean onLogin(UserLoginDto loginDto) //throws UnsupportedEncodingException
	{
		User user = modelMapper.map(loginDto, User.class);
		User validUser =userRepository.findByEmailId(user.getEmailId()).orElseThrow(()-> new com.thoughtworks.iflix.exception.UserException(401,""));
		
		 if(validUser.getPassword()==user.getPassword())
		  {
			   return true;
		  }
		return false;
	}
	
	/**
	 * Method to create User
	 */
	public boolean onCreate(User user)  
	{
		Optional<User> userAvailable = userRepository.findByEmailId(user.getEmailId());
		System.out.println(userAvailable);
		if (userAvailable.isPresent())
		{
			throw new UserException(401,"user already exists");
		}

	    userRepository.save(user);
		return true;
	}
}
