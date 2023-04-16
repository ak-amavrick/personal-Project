package com.welixco72.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.welixco72.entity.Billing;
import com.welixco72.entity.Contact;
import com.welixco72.service.BillingService;
import com.welixco72.service.ContactService;

@Controller
public class BillingController {
	@Autowired
	private BillingService billingService;
	
	
	
	@Autowired
	private ContactService contactService;
	
    @RequestMapping("/createBill")
	public String CreateBill(@RequestParam("bid")long id, ModelMap model) {
    	Contact contact = contactService.findContactById(id);
    	model.addAttribute("contact", contact);
    	return"create_bill ";
    		
	}
    @RequestMapping("/savebill")
    public String savebill(@ModelAttribute("bill")Billing bill) {
    	billingService.SaveBill(bill);
    	return"";
    	
    }
}
