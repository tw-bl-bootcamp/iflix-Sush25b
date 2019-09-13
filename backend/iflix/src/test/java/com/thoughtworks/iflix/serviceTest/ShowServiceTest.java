package com.thoughtworks.iflix.serviceTest;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.exception.UserException;
import com.thoughtworks.iflix.model.Show;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.model.Venue;
import com.thoughtworks.iflix.repository.IShowRepository;
import com.thoughtworks.iflix.repository.IUserRepository;
import com.thoughtworks.iflix.service.ShowService;
import com.thoughtworks.iflix.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class ShowServiceTest 
{
	@Mock
	IShowRepository showRepository;

	@InjectMocks
	ShowService showService=new ShowService();

	@Test
   	public void getMoviesList_whenchecked_thenReturnList()
   	{		
		List<Show> list=new ArrayList<>();
		list.add(new Show("blackmen","2.3", "good,average"));
		list.add(new Show("men","4/5", "bad,average, not good"));
		list.add(new Show("kmen","3.4", "good one, nice acting"));
		
   		when(showRepository.findAll()).thenReturn(list);
   		assertEquals(list.size(), showService.getshowList().size());
   	}
}
