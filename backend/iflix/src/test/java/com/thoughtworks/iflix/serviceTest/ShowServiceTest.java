package com.thoughtworks.iflix.serviceTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;

import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.repository.IShowRepository;
import com.thoughtworks.iflix.repository.IUserRepository;
import com.thoughtworks.iflix.service.ShowService;
import com.thoughtworks.iflix.service.UserService;

public class ShowServiceTest 
{
	@Mock
	IShowRepository showRepository;

	@InjectMocks
	ShowService showService=new ShowService();

}
