package com.CarSales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarSales.entity.Car;
import com.CarSales.services.CarServices;
@RestController
@RequestMapping("/api")
public class controller {
	@Autowired
	private CarServices Service;

	@GetMapping("/Car")
	public List<Car> getAll(){
		return Service.get();
	}
	@GetMapping("/Id/{id}")
	public Car getById(@PathVariable Integer id) {
		return Service.getById(id);
	}
	@PostMapping("/done")
	public Car Save(@RequestBody Car car) {
		return Service.save(car);
	}
	@PutMapping("/update/{id}")
	public Car updateById(@RequestBody Car car) {
		return Service.save(car);
	}
	@DeleteMapping("/Id/{id}")
	public String deleteById(@PathVariable Integer id) {
		return Service.deleteById(id);
	}
}
