package com.FlightProject2.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightProject2.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	 User findByEmail(String emailId);

}
