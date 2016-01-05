package com.tsmiecho.banking.pojo;

import java.math.BigDecimal;

public interface Itransfer {
	
	Account getSenderAccount();
	
	BigDecimal getBalanceAfterTransactionSender();
	
	void setBalanceAfterTransactionSender(BigDecimal balanceAfterTransactionSender);
}
