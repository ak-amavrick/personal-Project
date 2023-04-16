package com.welixco72.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welixco72.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
