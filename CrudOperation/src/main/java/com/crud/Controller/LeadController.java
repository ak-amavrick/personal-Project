package com.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Lead.Lead;
import com.crud.Service.LeadService;

@RequestMapping("/api")
@RestController
public class LeadController {

	@Autowired
	private LeadService leadserv;
	
	@PostMapping("/save")
	public Lead save(@RequestBody Lead lead) {
		return leadserv.save(lead);
	}
	
}
