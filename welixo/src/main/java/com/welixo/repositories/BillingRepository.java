package com.welixo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welixo.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
