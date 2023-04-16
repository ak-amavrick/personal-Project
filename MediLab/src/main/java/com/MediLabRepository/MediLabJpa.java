package com.MediLabRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MediLabEntity.MediLab;
@Repository
public interface MediLabJpa extends JpaRepository<MediLab, Integer> {

}
