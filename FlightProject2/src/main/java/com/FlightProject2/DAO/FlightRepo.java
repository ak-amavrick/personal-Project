package com.FlightProject2.DAO;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.FlightProject2.Entity.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {

	@Transactional
	@Modifying
	 @Query(value = "SELECT * FROM flight WHERE  DEPARTURE_CITY= ?1  and ARRIVAL_CITY=?2", nativeQuery = true)
	 List<Flight> findFlights(@Param("departureCity")String from,@Param("arrivalCity") String to);

}
