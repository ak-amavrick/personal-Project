package com.Demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.entities.Demo;
import com.Demo.repository.DemoRepository;

@Service
public class DemoServices {
	
	@Autowired
	private DemoRepository demoRepo;
	
	
	public Demo save(Demo demo) {
		return demoRepo.save(demo);
		
	}
	public List<Demo> getAll(){
		return demoRepo.findAll();
	}
	
	public Demo getById(Integer id ) {
		return demoRepo.findById(id).orElse(null);
	}
	
	public Demo updateById(Demo demo) {
		return demoRepo.save(demo);
	}
	
	
	public String deleteById(Integer id) {
		 demoRepo.deleteById(id);
		return "delete successfully"; 
	}

}
