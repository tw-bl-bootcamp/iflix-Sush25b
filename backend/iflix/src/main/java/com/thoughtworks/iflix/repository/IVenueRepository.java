package com.thoughtworks.iflix.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtworks.iflix.model.Show;
import com.thoughtworks.iflix.model.Venue;

public interface IVenueRepository extends JpaRepository<Venue, Long>
{

	Optional<Venue> findByvenueName(String venueName);

}
