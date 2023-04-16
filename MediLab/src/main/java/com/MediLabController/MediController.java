package com.MediLabController;

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

import com.MediLabEntity.MediLab;
import com.MediLabService.Medilab;

@RequestMapping("/api")
@RestController
public class MediController {

	@Autowired
	private Medilab Service;

	@GetMapping("/medi")
	public List<MediLab> getAll(){
		return Service.getAll();
	}
	@GetMapping("/Id")
	public MediLab getById(@PathVariable Integer id) {
		return Service.getById(id);
	}
	@PostMapping("/done")
	public MediLab Save(@RequestBody MediLab medi) {
		return Service.Save(medi);
	}
	@PutMapping("/update/{id}")
	public MediLab updateById(@RequestBody MediLab medi) {
		return Service.Save(medi);
	}
	@DeleteMapping("/Id/{id}")
	public String deleteById(@PathVariable Integer id) {
		return Service.deleteById(id);
	}
}
