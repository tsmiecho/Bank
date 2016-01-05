package com.tsmiecho.banking.controller;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test
 *
 * @author Tomasz Śmiechowicz
 */
public class UserControllerImplTest{
	
	private static final Logger logger = Logger.getLogger(UserControllerImplTest.class);
	
	static{
		logger.info("UserControllerImplTest is loaded");
	}
	
	@Test
	public void createUser() {
		Assert.assertTrue(Boolean.valueOf(true));
	}

}
