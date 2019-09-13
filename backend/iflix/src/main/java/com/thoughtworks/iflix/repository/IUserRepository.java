package com.thoughtworks.iflix.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.thoughtworks.iflix.model.User;

public interface IUserRepository extends JpaRepository<User, Long>
{
	    //creating a new method
		public Optional<User> findByEmailId(String emailId);
	
}
