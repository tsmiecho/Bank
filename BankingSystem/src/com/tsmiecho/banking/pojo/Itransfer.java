package com.tsmiecho.banking.pojo;

public interface Itransfer {
	
	Account getSenderAccount();
	
	double getBalanceAfterTransactionSender();
	
	void setBalanceAfterTransactionSender(double balanceAfterTransactionSender);
}
