package com.tsmiecho.banking.dao;

import java.util.GregorianCalendar;
import java.util.List;

import com.tsmiecho.banking.pojo.Account;
import com.tsmiecho.banking.pojo.Deposit;
import com.tsmiecho.banking.pojo.DomesticTransfer;
import com.tsmiecho.banking.pojo.ForeignTransfer;
import com.tsmiecho.banking.pojo.Transaction;
import com.tsmiecho.banking.pojo.User;

public interface TransactionDao {

	void cancelTransaction(Transaction transaction);

	void confirmTransaction(Transaction transaction);

	boolean createDeposit(Deposit deposit);

	boolean createForeignTransfer(ForeignTransfer foreignTransfer);

	boolean createDomesticTransfe(DomesticTransfer domesticTransfer);

	List<Transaction> getConfirmedTransactionList();

	Transaction getWaitingTransactionByNumber(int transactionNumber);

	List<Transaction> getCanceledTransactionList();

	void showHistory(User user);

	void showAccountHistory(Account accountByNumber);

	void showAccountHistory(Account accountByNumber, GregorianCalendar t);


}
