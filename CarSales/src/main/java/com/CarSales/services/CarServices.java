package com.CarSales.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CarSales.entity.Car;
import com.CarSales.repository.CarJpa;

@Service
public class CarServices {
	@Autowired
	private CarJpa repo;

	public Car save(Car car) {
		return repo.save(car);
	}
	public List<Car> get(){
		return repo.findAll();
	}
	public Car getById(Integer vid) {
		return repo.findById(vid).orElse(null);
	}
	public String deleteById(Integer vid ) {
		repo.deleteById(vid);
		return"deleted";
	}
}
