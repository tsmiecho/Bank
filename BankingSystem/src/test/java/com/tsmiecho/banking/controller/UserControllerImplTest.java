package com.tsmiecho.banking.controller;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.tsmiecho.banking.dao.UserDao;
import com.tsmiecho.banking.engine.BinProvider;
import com.tsmiecho.banking.pojo.User;

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
	
	private UserDao userDao;
	
	private BinProvider binProvider;
	
	public UserControllerImplTest() {
		binProvider = new BinProvider();
		userDao = binProvider.getUserDao();
	}
	
	@Test
	public void createUser() {
		Assert.assertTrue(userDao.createUser(new User("", "0", "")));
	}

}
