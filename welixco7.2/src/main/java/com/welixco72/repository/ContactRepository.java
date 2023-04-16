package com.welixco72.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.welixco72.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
