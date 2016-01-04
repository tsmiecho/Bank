package com.tsmiecho.banking.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.tsmiecho.banking.pojo.Account;
import com.tsmiecho.banking.pojo.User;

@Repository
public class UserDaoMemImpl implements UserDao {
	private Set<User> users;

	public UserDaoMemImpl() {
		users = new HashSet<>();
	}

	public boolean createUser(User user) {
		boolean tmp = false;
		for (User u : users) {
			if (u.getSsn().equals(user.getSsn())  	||	 u.getIdNumber().equals(user.getIdNumber())) {
				tmp = true;
			} 
			else {
				tmp = false;
			}
		}
		if(!tmp){
			return users.add(user);
		}
		return false;
	}

	public Set<User> getAllUsers() {
		return users;
	}

	public boolean deleteUser(User user) {
		if(user == null){
			return false;
		}
		else  {
			return users.remove(user);
		}
	}
	
	public boolean createAccount(User user, Account account) {
		if(user == null){
			return false;
		}
		else if(account == null){
			return false;
		}
		else if(account.getSwift().length() != 8){
			return false;
		}
		else  {
			return user.getAccountsList().add(account);
		}
	}
	
	public boolean deleteAccount(User user, Account account) {
		if(user == null){
			return false;
		}
		else{
			user.getClosedAccountsList().add(account);
			return user.getAccountsList().remove(account);
		} 
	}

	public User getUserById(String id) {
		User tmp = null;
		for (User u : users) {
			if (u.getIdNumber().equals(id)) {
				tmp = u;
			}
		}
		return tmp;
	}

	public Account getAccountByNumber(String string) {
		Account tmp = null;
		for (User u : users) {
			for (Account a : u.getAccountsList()) {
				if (a.getNumber().equals(string)) {
					tmp = a;
				}
			}
		}
		return tmp;
	}

	
}
