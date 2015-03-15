package com.tsmiecho.banking.dao;

import java.util.Set;

import com.tsmiecho.banking.pojo.Account;
import com.tsmiecho.banking.pojo.User;

public interface UserDao {
	boolean createUser(User user);

	Set<User> getAllUsers();

	boolean deleteUser(User user);

	boolean createAccount(User user, Account account);

	boolean deleteAccount(User user, Account account);

	User getUserById(String id);

	Account getAccountByNumber(String string);



}
