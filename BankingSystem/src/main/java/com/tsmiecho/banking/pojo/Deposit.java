package com.tsmiecho.banking.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Deposit extends Transaction {
	
	private static final int DEPOSIT_NUMBER_BASE = 10000;
	
	public Deposit(Account receiverAccount, String title, BigDecimal amount) {
		
		this.setTransactionStatus(EnumTransactionStatus.Accepted);
		this.setReceiverAccount(receiverAccount);
		this.setTitle(title);
		this.setTransactionNumber(DEPOSIT_NUMBER_BASE + transactionCounter);
		this.setAmount(amount);
		this.setTransactionDate(LocalDate.now());
	}

}

