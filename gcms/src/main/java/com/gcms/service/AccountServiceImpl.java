package com.gcms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcms.dao.AccountDAO;
import com.gcms.entity.User;
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired(required = false)
	private AccountDAO accountDAO;
	@Transactional
	public void addUser(User user) {
		accountDAO.addUser(user);
	}

}
