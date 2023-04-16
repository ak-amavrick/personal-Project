package com.welixco72.service;

import java.util.List;

import com.welixco72.entity.Lead;

public interface LeadService {
public void saveleadInfo(Lead lead);
public void deleteLeadById(long id);
public List<Lead> getAllLeads();
public Lead findLeadById(long id);
}