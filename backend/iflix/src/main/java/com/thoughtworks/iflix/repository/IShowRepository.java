package com.thoughtworks.iflix.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtworks.iflix.model.Show;
import com.thoughtworks.iflix.model.User;

public interface IShowRepository extends JpaRepository<Show, Long>
{
	 //creating a new method
	public Optional<Show> findByshowname(String showname);
}
