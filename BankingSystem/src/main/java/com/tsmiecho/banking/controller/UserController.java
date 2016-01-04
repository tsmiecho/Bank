package com.tsmiecho.banking.controller;

import java.util.Set;

import com.tsmiecho.banking.pojo.Account;
import com.tsmiecho.banking.pojo.User;

public interface UserController {
	
	void createUser(User user);

	Set<User> getAllUsers();

	void deleteUser(User user);

	void createAccount(User user, Account account);

	void deleteAccount(User user,Account account);

	User getUserById(String Id);

	Account getAccountByNumber(String string);

	
		
}
