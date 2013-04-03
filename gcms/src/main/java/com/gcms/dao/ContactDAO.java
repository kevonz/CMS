package com.gcms.dao;

import java.util.List;

import com.gcms.form.Contact;
 
public interface ContactDAO {
     
    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}