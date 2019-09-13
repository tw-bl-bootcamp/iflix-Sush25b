package com.thoughtworks.iflix.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	public boolean addNewVenue(Venue venue) {
		
		Optional<Venue> venueAvailable = venueRepository.findByvenueName(venue.getVenueName());
		
		System.out.println(venueAvailable);
		if (venueAvailable.isPresent())
		{
			throw new UserException(401,"venueAvailable already exists");
		}

		venueRepository.save(venue);
		return true;
	}
	

	
	
}
