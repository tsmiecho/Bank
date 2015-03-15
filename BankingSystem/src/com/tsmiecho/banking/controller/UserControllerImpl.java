package com.tsmiecho.banking.controller;

import java.util.Set;

import com.tsmiecho.banking.dao.UserDao;
import com.tsmiecho.banking.engine.BinProvider;
import com.tsmiecho.banking.pojo.Account;
import com.tsmiecho.banking.pojo.User;

public class UserControllerImpl implements UserController {
	private UserDao userDao;
	private BinProvider binProvider;
	public UserControllerImpl() {
		binProvider = new BinProvider();
		userDao = binProvider.getUserDao();
	}

	public void createUser(User user) {
		 userDao.createUser(user);
	}

	public void deleteUser(User user) {
		if(!userDao.deleteUser(user)){
			System.out.println("User not found");
		}
	}

	public Set<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public void deleteAccount(User user,Account account) {
		userDao.deleteAccount(user,account);
		
	}
	
	public void createAccount(User user, Account account) {
		userDao.createAccount(user, account);
		
	}

	public User getUserById(String id) {
		return userDao.getUserById(id);
	}

	public Account getAccountByNumber(String string) {
		return userDao.getAccountByNumber(string);
	}

	
}
