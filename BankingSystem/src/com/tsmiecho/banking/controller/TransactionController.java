package com.tsmiecho.banking.controller;

import java.util.GregorianCalendar;
import java.util.List;

import com.tsmiecho.banking.pojo.Account;
import com.tsmiecho.banking.pojo.Deposit;
import com.tsmiecho.banking.pojo.DomesticTransfer;
import com.tsmiecho.banking.pojo.ForeignTransfer;
import com.tsmiecho.banking.pojo.Transaction;
import com.tsmiecho.banking.pojo.User;

public interface TransactionController {


	boolean createDeposit(Deposit deposit);

	boolean createForeignTransfer(ForeignTransfer foreignTransfer);

	boolean createDomesticTransfer(DomesticTransfer domesticTransfer);
	
	Transaction getWaitingTransactionByNumber(int transactionNumber);

	void confirmTransaction(Transaction transaction);
	
	void cancelTransaction(Transaction transaction);
	
	List<Transaction> getConfirmedTransactionList();
	
	List<Transaction> getCanceledTransactionList();

	void showHistory(User user);

	void showAccountHistory(Account accountByNumber);

	void showAccountHistory(Account accountByNumber, GregorianCalendar t);

}
