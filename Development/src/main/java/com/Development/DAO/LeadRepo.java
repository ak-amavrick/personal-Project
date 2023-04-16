package com.Development.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Development.Lead.Lead;
@Repository
public interface LeadRepo extends JpaRepository<Lead, Integer> {

}
