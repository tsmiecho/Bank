package com.tsmiecho.banking.dao;

import java.util.Set;

import com.tsmiecho.banking.pojo.User;


public interface UserDao {

	void createUser(User user);
	
	void deleteUser(User user);
	
	Set<User> findUsers(String value);

	void deleteUserById(String userId);
}
