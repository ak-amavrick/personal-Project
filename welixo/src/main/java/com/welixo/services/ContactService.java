package com.welixo.services;

import java.util.List;

import com.welixo.entities.Contact;
public interface ContactService {
  
	public void saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact findContactById(long id);
}
