package com.gcms.dao;

import java.util.List;

import javax.annotation.Resource;

import com.gcms.entity.Contact;
 

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
 
@Repository
public class ContactDAOImpl implements ContactDAO {
 
	@Resource
    private SessionFactory sessionFactory;
 
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }
 
    @SuppressWarnings("unchecked")
	public List<Contact> listContact() {
 
        return sessionFactory.getCurrentSession().createQuery("from Contact")
                .list();
    }
 
    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(
                Contact.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }
 
    }
}
