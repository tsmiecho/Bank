package com.tsmiecho.banking.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tsmiecho.banking.dao.UserDao;
import com.tsmiecho.banking.pojo.User;


/**
 * Controller for user search.
 * 
 * @author Tomasz Śmiechowicz
 */

@Controller
@RequestMapping("/admin/find_user")
public class FindUserController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public String toGet(ModelMap model){
		return "find_user";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String toPost(@RequestParam("value") String value, ModelMap model){
		Set<User> users = userDao.findUsers(value);
		model.addAttribute("users", users);
		return "find_user";
	}
}
