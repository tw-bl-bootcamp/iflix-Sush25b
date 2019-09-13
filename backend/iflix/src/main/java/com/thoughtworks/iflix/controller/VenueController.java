package com.thoughtworks.iflix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.iflix.dto.UserLoginDto;
import com.thoughtworks.iflix.model.User;
import com.thoughtworks.iflix.model.Venue;
import com.thoughtworks.iflix.service.UserService;
import com.thoughtworks.iflix.service.VenueService;

@RestController
@RequestMapping("/iflix")
public class VenueController 
{
	@Autowired
	VenueService venueService;
	
	@PostMapping("/addVenue")
	public boolean addVenue(@RequestBody Venue venue) 
	{
		return venueService.addNewVenue(venue);
	}

}
