package com.thoughtworks.iflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtworks.iflix.model.User;

public interface IShowRepository extends JpaRepository<User, Long>
{
		
}
