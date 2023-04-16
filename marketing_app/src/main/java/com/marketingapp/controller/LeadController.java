package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.dto.LeadData;
import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;
import com.marketingapp.utility.EmailService;
 

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
 @Autowired
 private EmailService emailService;
	
	@RequestMapping("/viewLeadPage")
	public String viewSaveLeadPage() {
		return "new_lead";
		
	}
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@RequestParam("firstName")String firstName,@RequestParam("lastName")String lastName,@RequestParam("email")String email,@RequestParam("mobile")Long mobile) {
//      Lead l= new Lead();
//      l.setFirstName(firstName);
//      l.setLastName(lastName);
//      l.setEmail(email);
//      l.setMobile(mobile);
//      leadService.saveLead(l);
//		return"new_lead";
//	}
	
//	
//    @RequestMapping("/saveLead")
//	public String saveOneLead(LeadData leadData) {
//		System.out.println(leadData.getFirstName());
//		System.out.println(leadData.getLastName());
//		System.out.println(leadData.getEmail());
//		System.out.println(leadData.getMobile());
//		return"new_lead";
//	}
	@RequestMapping("/saveLead")
public String saveOneLead(@ModelAttribute Lead lead , ModelMap model) {
		leadService.saveLead(lead);
		emailService.sendSimpleMessage("amavrick616@gmail.com", "Test", "Lead Is Saved!!");
		model.addAttribute("msg","Lead Is Saved!!");
		return "new_lead";
 
}
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads", leads);
		return "lead_search_result";
		
	}

    @RequestMapping("/delete")
	public String deleteOneLocation(@RequestParam("id") long id , ModelMap model) {
	leadService.deleteLead(id);
	List<Lead> leads = leadService.getLeads();
	model.addAttribute("leads", leads);
	return "lead_search_result";
	
	}
    

    @RequestMapping("/update")
	public String updateOneLocation(@RequestParam("id") long id , ModelMap model) {
	Lead lead = leadService.findOneLead(id);
    model.addAttribute("lead", lead);
	return "update_lead";
	
	}
	@RequestMapping("/updateLead")
public String updateLead(LeadData  lead , ModelMap model) {
	Lead l = new Lead();
	l.setId(lead.getId());
	l.setFirstName(lead.getFirstName());
	l.setLastName(lead.getLastName());
	l.setEmail(lead.getEmail());
	l.setMobile(lead.getMobile());
	
	leadService.saveLead(l);
	
	List<Lead> leads = leadService.getLeads();
	model.addAttribute("leads", leads);
	return "lead_search_result";
		 
 
}
}
