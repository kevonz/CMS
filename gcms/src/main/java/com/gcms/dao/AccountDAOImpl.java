/**
 * 
 */
package com.gcms.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gcms.entity.User;

/**
 * @author Kevon
 *
 */
@Repository
public class AccountDAOImpl implements AccountDAO {
	
    @Autowired
    private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.gcms.dao.AccountDao#addUser(com.gcms.entity.User)
	 */
	public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
	}

}
