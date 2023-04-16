package com.DevelopmentDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevelopmentLead.Lead;

public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
