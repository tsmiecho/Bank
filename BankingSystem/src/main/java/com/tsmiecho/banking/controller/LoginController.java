package com.tsmiecho.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Main controller to sign in.
 *
 * @author Tomasz Śmiechowicz
 */

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String toGet(ModelMap model){
		return "login";
	}
}
