package com.welixco72.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welixco72.entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
