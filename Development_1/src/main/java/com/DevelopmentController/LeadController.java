package com.DevelopmentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DevelopmentLead.Lead;
import com.DevelopmentService.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadserv;
		

		@RequestMapping("/viewCreateLead")
		public String viewCreateLead() {
			return "create_Lead";
		}
		@RequestMapping(value = "/DevLead", method = RequestMethod.POST)
		public String devLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
			try {
				leadserv.devLeadInfo(lead);
				model.addAttribute("lead", lead);
			} catch (Exception e) {
				model.addAttribute("emailError", "email is already exist");
				return "create_Lead";
			}
			return "Validate_Lead";
		}
}
