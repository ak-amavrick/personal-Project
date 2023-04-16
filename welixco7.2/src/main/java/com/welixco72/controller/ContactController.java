package com.welixco72.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.welixco72.entity.Contact;
import com.welixco72.entity.Lead;
import com.welixco72.service.ContactService;
import com.welixco72.service.LeadService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private LeadService leadService;
	
    @RequestMapping("/convertLead") 
	public String ConvertLead(@RequestParam("id")long id ,ModelMap model) {
    	Lead lead=leadService.findLeadById(id);
    	
    	Contact contact = new Contact();
    	contact.setFirstName(lead.getFirstName());
    	contact.setLastName(lead.getLastName());
    	contact.setLeadSource(lead.getLeadSource());
    	contact.setEmail(lead.getEmail());
    	contact.setMobile(lead.getMobile());
    	
    	contactService.saveContact(contact);
    	
    	leadService.deleteLeadById(id);
    	
    	List<Contact> contacts = contactService.getAllContact();
    	model.addAttribute("contacts", contacts);
		return"contact_search_result";
	}
    @RequestMapping("/contactInfo")
	public String leadInfo(@RequestParam("id")long id,ModelMap model) {
		Contact contact= contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return"contact_info";
		
	}
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.getAllContact();
    	model.addAttribute("contacts", contacts);
		return"contact_search_result";
		
	}
}
