package com.CarSales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CarSales.entity.Car;
@Repository
public interface CarJpa extends JpaRepository<Car, Integer> {

}
