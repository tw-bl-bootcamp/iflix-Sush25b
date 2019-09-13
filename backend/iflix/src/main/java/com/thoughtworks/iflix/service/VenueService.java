package com.thoughtworks.iflix.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.thoughtworks.iflix.exception.UserException;
import com.thoughtworks.iflix.model.Show;
import com.thoughtworks.iflix.model.Venue;
import com.thoughtworks.iflix.repository.IShowRepository;
import com.thoughtworks.iflix.repository.IVenueRepository;

@Service
public class VenueService 
{
	@Autowired
	IVenueRepository venueRepository;
	
	@Autowired
	IShowRepository showRepository;
	
	public boolean addNewVenue(Venue venue,String showname) {
		
		Optional<Venue> venueAvailable = venueRepository.findByvenueName(venue.getVenueName());
		Optional<Show> showAvailable = showRepository.findByshowname(showname);
		
		System.out.println(venueAvailable);
		if (venueAvailable.isPresent())
		{
			throw new UserException(401,"venueAvailable already exists");
		}

		showAvailable.get().getVenues().add(venue);
		showRepository.save(showAvailable.get());
		return true;
	}
	
}
