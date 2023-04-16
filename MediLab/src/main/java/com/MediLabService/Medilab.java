package com.MediLabService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MediLabEntity.MediLab;
import com.MediLabRepository.MediLabJpa;

@Service
public class Medilab {
	@Autowired
	private  MediLabJpa repo;
	
	public List<MediLab> getAll(){
		return repo.findAll();
		
	}
	public MediLab getById(Integer id) {
		return repo.findById(id).orElse(null); 
		

	}
	public MediLab Save(MediLab medi) {
		return repo.save(medi);
	}
	public String deleteById(Integer id) {
		 repo.deleteById(id);
		 return "deleted";
	}

}
