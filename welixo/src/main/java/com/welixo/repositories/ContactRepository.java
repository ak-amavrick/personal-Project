package com.welixo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welixo.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long>  {

}
