package com.thoughtworks.iflix.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.repository.IUserRepository;

@Service
public class UserService 
{
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	IUserRepository userRepository;
	
	/**
	 * Method to---> login
	 */
	public boolean onLogin(UserLoginDto loginDto) //throws UnsupportedEncodingException
	{
		User user = modelMapper.map(loginDto, User.class);
		User validUser =userRepository.findByEmailid(user.getEmailid()).orElseThrow(()-> new com.thoughtworks.iflix.exception.UserException(401,""));
		
		 if(validUser.getPassword()==user.getPassword())
		  {
			 System.out.println(validUser.getPassword()+"<============>"+loginDto.getPassword());
				  System.out.println("!!!!!!!!!!!!!!!!!");
			     // throw new UserException(401,environment.getProperty("user.wrongemailid"));
				  return true;
		  }
		return false;
	}

}
