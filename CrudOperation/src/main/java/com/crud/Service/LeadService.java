package com.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.DAO.LeadRepository;
import com.crud.Lead.Lead;
@Service
public class LeadService {
	
@Autowired	
private LeadRepository leadrepo;



public Lead save(Lead lead) {
	return leadrepo.save(lead);
}
}
