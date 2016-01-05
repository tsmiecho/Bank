package com.tsmiecho.banking.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tsmiecho.banking.dao.UserDao;
import com.tsmiecho.banking.pojo.User;


/**
 * Controller for adding users.
 * 
 * @author Tomasz Śmiechowicz
 */

@Controller
@RequestMapping("/new_user")
public class NewUserController {
	
	private static final Logger logger = Logger.getLogger(NewUserController.class);
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public String toGet(ModelMap model){
		model.addAttribute("user",new User());
		return "new_user";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String toPost(@ModelAttribute("user") User user, ModelMap model){
		if(logger.isDebugEnabled()){
			logger.debug(user);
		}
		userDao.createUser(user);
		return "hello";
	}
}
