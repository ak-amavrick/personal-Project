package com.welixo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welixo.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
