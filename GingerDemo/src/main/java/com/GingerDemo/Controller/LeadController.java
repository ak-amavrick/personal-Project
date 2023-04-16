package com.GingerDemo.Controller;

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

import com.GingerDemo.Entity.Lead;
import com.GingerDemo.Repository.LeadRepository;

@RestController
@RequestMapping("/api")
public class LeadController {

	@Autowired
	public LeadRepository leadRepo;

	/*
	 * @PostMapping public Lead save(@RequestBody Lead lead) { return
	 * leadRepo.save(lead); }
	 * 
	 * @GetMapping public List<Lead> findAllData(){ return leadRepo.findAll(); }
	 * 
	 * @GetMapping("/{id}") public Lead findById(@PathVariable int id) { return
	 * leadRepo.getById(id); }
	 * 
	 * @DeleteMapping("/{id}") public String removeById(@PathVariable int id) {
	 * return leadRepo.deleteById(id); }
	 */
	
	
	@PostMapping
	public Lead save(@RequestBody Lead lead) {
		return leadRepo.saveLead(lead);
	}
	
	 @GetMapping 
	 public List<Lead> findAllData(){
		 return leadRepo.getAllLead();
	 }
	
	
	 @GetMapping("/{id}")
	 public Lead findById(@PathVariable int id) {
		 return leadRepo.findById(id);
	 }
	
	 @DeleteMapping("/{id}") 
	 public void removeById(@PathVariable int id) {
		 leadRepo.delete(id);
	 }
	 @PutMapping
	 public void update(@RequestBody Lead lead) {
		 leadRepo.saveLead(lead);
	 }
	 
	
}
