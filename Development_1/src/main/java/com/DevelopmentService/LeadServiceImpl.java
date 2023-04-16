package com.DevelopmentService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevelopmentDAO.LeadRepository;
import com.DevelopmentLead.Lead;
@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	
	private LeadRepository leadrepo;
	
		@Override
		public void devLeadInfo(Lead lead) throws RuntimeException {
			leadrepo.save(lead);
	}

//		public List<Lead>getAll(){
//			return leadrepo.findAll();
//		}
}
