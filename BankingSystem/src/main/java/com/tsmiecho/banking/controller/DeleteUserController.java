package com.tsmiecho.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tsmiecho.banking.dao.UserDao;


/**
 * Controller for removing users.
 * 
 * @author Tomasz Śmiechowicz
 */

@Controller
@RequestMapping("/admin/delete_user")
public class DeleteUserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(method = RequestMethod.POST)
	public String toPost(@RequestParam("userId") String userId, ModelMap model){
		userDao.deleteUserById(userId);
		return "hello";
	}
}
