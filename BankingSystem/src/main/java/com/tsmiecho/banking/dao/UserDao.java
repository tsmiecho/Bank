package com.tsmiecho.banking.dao;

import com.tsmiecho.banking.pojo.User;


public interface UserDao {

	void createUser(User user);
	
	void deleteUser(User user);
}
