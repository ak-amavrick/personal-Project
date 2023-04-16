package com.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Demo.entities.Demo;
@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer> {

}
