package com.thoughtworks.iflix.serviceTest;

import static org.junit.Assert.assertEquals;
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

import com.thoughtworks.iflix.model.Show;
import com.thoughtworks.iflix.model.Venue;
import com.thoughtworks.iflix.repository.IShowRepository;
import com.thoughtworks.iflix.repository.IVenueRepository;
import com.thoughtworks.iflix.service.ShowService;
import com.thoughtworks.iflix.service.VenueService;

@RunWith(MockitoJUnitRunner.class)
public class VenueServiceTest 
{
	@Mock
	IVenueRepository venueRepository;

	@Mock
	IShowRepository showRepository;
	
	@InjectMocks
	VenueService venuetest=new VenueService();

	@Test
   	public void getMoviesVenue_whenchecked_thenReturnList()
   	{		
		
		Venue venue=new Venue(1, "jpnagar");
		
		when(venueRepository.findByvenueName(ArgumentMatchers.any())).thenReturn(Optional.of(venue));
		when(showRepository.findByshowname(ArgumentMatchers.anyString()))

		
   	}
}
