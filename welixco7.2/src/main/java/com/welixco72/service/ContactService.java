package com.welixco72.service;

import java.util.List;

import com.welixco72.entity.Contact;

public interface ContactService {
public void saveContact(Contact contact);
public List<Contact> getAllContact();
public Contact findContactById(long id);

}
