package com.welixco72.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.welixco72.entity.Billing;
import com.welixco72.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
@Autowired
private BillingRepository  billingRepo;

	@Override
	public void SaveBill(Billing bill) {
    billingRepo.save(bill);
	}

	
	

}
