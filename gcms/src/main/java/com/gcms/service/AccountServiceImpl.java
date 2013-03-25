package com.gcms.service;

import java.util.List;

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
	
	@Transactional
	public List<User> listUser(){
		return accountDAO.listUser();
	}

	@Transactional
	public void removeUser(int id) {
		accountDAO.removeUser(id);		
	}

}
