package com.thoughtworks.iflix.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.thoughtworks.iflix.exception.UserException;
import com.thoughtworks.iflix.model.Show;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.repository.IShowRepository;


@Service
public class ShowService 
{
	@Autowired
	IShowRepository showRepository;
	
	/**
	 * Create New Show
	 */
	public boolean createShow(Show show)
	{
		Optional<Show> showAvailable = showRepository.findByshowname(show.getShowname());
		
		System.out.println(showAvailable);
		if (showAvailable.isPresent())
		{
			throw new UserException(401,"showAvailable already exists");
		}

		showRepository.save(show);
		return true;
	}
}
