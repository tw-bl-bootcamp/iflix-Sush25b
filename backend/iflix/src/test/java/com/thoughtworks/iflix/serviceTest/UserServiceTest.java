package com.thoughtworks.iflix.serviceTest;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import com.thoughtworks.iflix.dto.UserDto;
import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.repository.IUserRepository;
import com.thoughtworks.iflix.service.UserService;

import org.mockito.ArgumentMatchers;
import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest
{
	@Mock
	IUserRepository userRepository;
	
	@Mock
    ModelMapper modelMapper;

	@InjectMocks
    UserService userService=new UserService();

    @Test
	public void givenADummyUserWithWrongDetails_whenchecked_thenReturnFailed()
	{	
    	UserLoginDto userLoginDto= new UserLoginDto("patil@gmail.com", "2345"); 
    	
    	User dummyUser=new User( null, null, "patil@gmail.com", "2345");
    	
		User user=new User("sushant","patil","p@gmail.com","1234");  //valid Object
		Optional<User> validUser= Optional.ofNullable(user);
		
		when(modelMapper.map(ArgumentMatchers.any(),ArgumentMatchers.any())).thenReturn(dummyUser);
		when(userRepository.findByEmailId(ArgumentMatchers.anyString())).thenReturn(validUser);
     	
		assertFalse(userService.onLogin(userLoginDto));
	}
    
    @Test
   	public void givenADummyUserWithCorrectDetails_whenchecked_thenReturnTrue()
   	{	
       	UserLoginDto userLoginDto= new UserLoginDto("patil@gmail.com", "1234"); 
       	
       	User dummyUser=new User(null, null, "patil@gmail.com", "1234");
       	
   		User user=new User("sushant","patil","p@gmail.com","1234");  //valid Object
   		Optional<User> validUser= Optional.ofNullable(user);
   		
   		when(modelMapper.map(ArgumentMatchers.any(),ArgumentMatchers.any())).thenReturn(dummyUser);
   		when(userRepository.findByEmailId(ArgumentMatchers.anyString())).thenReturn(validUser);
        	
   		assertTrue(userService.onLogin(userLoginDto));
   	}
    
//    @Test
//   	public void givenUserDetailsToAddUser_whenSave_thenReturnTrue()
//   	{	
//    	UserDto userDto=new UserDto("sushant","patil","patil@gmail.com","1234");
//    	User user
//    	
//   		Optional<User> userAvailable= Optional.ofNullable(null);
//   		
//   		when(modelMapper.map(ArgumentMatchers.any(),ArgumentMatchers.any())).thenReturn(dummyUser);
//   		when(userRepository.findByEmailId(ArgumentMatchers.anyString())).thenReturn(validUser);
//        	
//   		assertTrue(userService.onLogin(userLoginDto));
//   	}
}
