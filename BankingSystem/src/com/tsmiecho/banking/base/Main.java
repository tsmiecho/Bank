package com.tsmiecho.banking.base;

import com.tsmiecho.banking.controller.TransactionController;
import com.tsmiecho.banking.controller.UserController;
import com.tsmiecho.banking.engine.BinProvider;
import com.tsmiecho.banking.pojo.Account;
import com.tsmiecho.banking.pojo.DomesticTransfer;
import com.tsmiecho.banking.pojo.User;


public class Main {

	public static void main(String... args) {
		
		BinProvider binProvider = new BinProvider();
		UserController uc = binProvider.getUserController();
		TransactionController tc = binProvider.getTransactionController();
		
		User u = new User("adas", "1","ww");
		u.setAddress("ldz");
		uc.createUser(u);
	
		
		
		uc.createAccount(uc.getUserById("1"), new Account("country", 100));
		uc.createAccount(uc.getUserById("1"), new Account("country", 20,"dwdw4443"));
		tc.createDomesticTransfer(new DomesticTransfer(uc.getAccountByNumber("00 5700 0000 1000"), uc.getAccountByNumber("00 5700 0000 1001"), "title", 3));
		tc.confirmTransaction(tc.getWaitingTransactionByNumber(10001));
		tc.createDomesticTransfer(new DomesticTransfer(uc.getAccountByNumber("00 5700 0000 1000"), uc.getAccountByNumber("00 5700 0000 1001"), "title", 1));
		tc.confirmTransaction(tc.getWaitingTransactionByNumber(10002));
		tc.createDomesticTransfer(new DomesticTransfer(uc.getAccountByNumber("00 5700 0000 1001"), uc.getAccountByNumber("00 5700 0000 1000"), "title", 9));
		tc.confirmTransaction(tc.getWaitingTransactionByNumber(10003));
		System.out.println(tc.getConfirmedTransactionList());
	
		
		
		
	}
}
