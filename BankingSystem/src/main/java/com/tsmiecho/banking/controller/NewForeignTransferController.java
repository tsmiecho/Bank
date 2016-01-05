package com.tsmiecho.banking.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Controller for new transaction
 * 
 * @author Tomasz Śmiechowicz
 */

@Controller
@RequestMapping("/")
public class NewForeignTransferController {
	
	private static final Logger logger = Logger.getLogger(NewForeignTransferController.class);
	
//	@RequestMapping(method = RequestMethod.GET)
//	public String toGet(ModelMap model){
//		model.addAttribute("ftransfer",);
//		return "foreign_transfer";
//	}
//	
//	@RequestMapping(method = RequestMethod.POST)
//	public String toPost(@ModelAttribute("ftransfer") ForeignTransfer ftr, ModelMap model){
//		logger.info(ftr);
//		return "hello";
//	}
}
