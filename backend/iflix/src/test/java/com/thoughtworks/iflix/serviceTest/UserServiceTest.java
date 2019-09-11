package com.thoughtworks.iflix.serviceTest;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.service.UserService;

@RunWith(SpringRunner.class)
public class UserServiceTest
{
	private static UserService userService;
	
	@BeforeClass
	public static void setUp()
	{
		userService=new UserService();
	}

    @Test
    public void givenDummyUserDetails_whenchecked_thenReturnFailed()
	{	
    	UserLoginDto userLoginDto= new UserLoginDto("p@gmail.com", "1234");  //Dummy Object
    	assertEquals(false, userService.onLogin(userLoginDto));
	}


}
