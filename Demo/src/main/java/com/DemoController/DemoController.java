package com.DemoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Demo.Service.DemoServices;
import com.Demo.entities.Demo;
@RequestMapping("/api")
@RestController
public class DemoController {

	@Autowired
	private DemoServices demoService;
	@PostMapping("/todo/abc")
	public Demo Save(@RequestBody Demo demo) {
		return demoService.save(demo);
		
	}
	@GetMapping("/todo")
	 public List<Demo>getALL(){
		return demoService.getAll();
		 
	 }
	

	
	
	
	
	
}
