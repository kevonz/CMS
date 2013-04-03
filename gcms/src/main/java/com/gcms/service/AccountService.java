package com.gcms.service;

import java.util.List;

import com.gcms.entity.User;

public interface AccountService {
	public void addUser(User user);
	public List<User> listUser();
	public void removeUser(int id);
}
