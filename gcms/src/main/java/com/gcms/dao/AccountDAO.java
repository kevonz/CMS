/**
 * 
 */
package com.gcms.dao;

import java.util.List;

import com.gcms.entity.User;

/**
 * @author Kevon
 *
 */
public interface AccountDAO {

	public void addUser(User user);
	
	public List<User> listUser();
	
	public void removeUser(Integer id);
}
