package com.gcms.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gcms.entity.Role;
import com.gcms.entity.User;
import com.gcms.service.AccountService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/account/register")
	public String register(Map<String, Object> map) {
		map.put("user", new User());
		map.put("userlist", accountService.listUser());
		return "register";
	}

	@RequestMapping(value = "/account/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("user")
    User user, BindingResult result) {
		
		if(user.getRole()==null){
			Role role=new Role();
			role.setRoleId(1);
			user.setRole(role);
		}
		accountService.addUser(user);
        return "redirect:/account/register";
    }
	

	@RequestMapping(value = "/account/delete/{userId}")
    public String delete(@PathVariable("userId")Integer userId) {
		accountService.removeUser(userId);
        return "redirect:/account/register";
    }
 
}
