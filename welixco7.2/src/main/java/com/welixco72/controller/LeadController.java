package com.welixco72.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.welixco72.entity.Lead;
import com.welixco72.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewCreateLead")
 public String viewCreateLead() {
	 return"create_Lead";
 }
	@RequestMapping(value="/savelead", method = RequestMethod.POST)
	public String saveOneLead(@ModelAttribute("lead") Lead lead,ModelMap model) {
		try {
			leadService.saveleadInfo(lead);
			model.addAttribute("Lead",lead);
		} catch (Exception e) {
		 model.addAttribute("email error", "this email id exist");
			return"create_Lead";
		}
		
		return"lead_info";
	}
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email") String email, ModelMap model) {
		model.addAttribute("email",email);
		System.out.println(email);
		return"compose_email";
		
	}
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		return"lead_search_result";
		
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id")long id,ModelMap model) {
		Lead lead= leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return"lead_info";
		
	}

}
