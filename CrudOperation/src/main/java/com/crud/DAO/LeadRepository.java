package com.crud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Lead.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
