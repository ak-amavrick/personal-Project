package com.Development.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Development.DAO.LeadRepo;
import com.Development.Lead.Lead;
@Service
public class LeadServImpl implements LeadService {

	@Autowired
	public LeadRepo leadrepo;
	
	@Override
	public void devLeadInfo(Lead lead) throws RuntimeException{
		
		leadrepo.save(lead);
		
	}

}
