package com.thoughtworks.iflix.service;

import java.io.IOException;
import java.util.List;
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
	public boolean createNewShow(Show show)
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
	
	/**
	 *get lis of available shows
	 */
	public List<Show> getshowList()
	{
		List<Show> listshowRepository= showRepository.findAll();
		
		System.out.println("9999999"+listshowRepository);
		if (listshowRepository.isEmpty())
		{
			throw new UserException(401,"No Movie Available");
		}
		return listshowRepository;
	}
}
