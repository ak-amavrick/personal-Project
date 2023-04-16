package com.FlightResevationRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightResevationEntity.FlightUser;

public interface FlightRepository extends JpaRepository<FlightUser, Integer> {

}
