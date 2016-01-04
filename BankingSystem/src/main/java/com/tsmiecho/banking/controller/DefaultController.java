package com.tsmiecho.banking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Main controller for /
 *
 * @author Tomasz Śmiechowicz
 */
@Controller
@RequestMapping("/")
public class DefaultController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String prString(ModelMap model){
		model.put("message", "Hello");
		return "hello";
	}
}
