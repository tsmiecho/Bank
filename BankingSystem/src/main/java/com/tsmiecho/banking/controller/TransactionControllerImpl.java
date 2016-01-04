package com.tsmiecho.banking.controller;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tsmiecho.banking.dao.TransactionDao;
import com.tsmiecho.banking.pojo.Account;
import com.tsmiecho.banking.pojo.Deposit;
import com.tsmiecho.banking.pojo.DomesticTransfer;
import com.tsmiecho.banking.pojo.ForeignTransfer;
import com.tsmiecho.banking.pojo.Transaction;
import com.tsmiecho.banking.pojo.User;

public class TransactionControllerImpl implements TransactionController {
	
	@Autowired
	private TransactionDao transactionDao;
	
	public boolean createDeposit(Deposit deposit) {
		return transactionDao.createDeposit(deposit);
	}

	public boolean createForeignTransfer(ForeignTransfer foreignTransfer) {
		return transactionDao.createForeignTransfer(foreignTransfer);
	}

	public boolean createDomesticTransfer(DomesticTransfer domesticTransfer) {
		return transactionDao.createDomesticTransfe(domesticTransfer);
	}

	public void confirmTransaction(Transaction transaction) {
		 transactionDao.confirmTransaction(transaction);
	}

	public void cancelTransaction(Transaction transaction) {
		 transactionDao.cancelTransaction(transaction);
	}
	
	public List<Transaction> getConfirmedTransactionList() {
		return transactionDao.getConfirmedTransactionList();
	}
	public Transaction getWaitingTransactionByNumber(int transactionNumber) {
		return transactionDao.getWaitingTransactionByNumber(transactionNumber);
	}
	public List<Transaction> getCanceledTransactionList() {
		return transactionDao.getCanceledTransactionList();
	}
	public void showHistory(User user) {
		transactionDao.showHistory(user);
	}
	public void showAccountHistory(Account accountByNumber) {
		transactionDao.showAccountHistory(accountByNumber);
		
	}
	public void showAccountHistory(Account accountByNumber, GregorianCalendar t) {
		transactionDao.showAccountHistory(accountByNumber,t);
	}
}
