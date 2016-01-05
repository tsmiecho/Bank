package com.tsmiecho.banking.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ForeignTransfer extends Transaction implements Itransfer {

	private BigDecimal balanceAfterTransactionSender;

	private Account senderAccount;

	private static final int FOREIGN_TRANSFER_NUMBER_BASE = 0;

	public ForeignTransfer() {
	};

	public ForeignTransfer(Account receiverAccount, Account senderAccount, String title, BigDecimal amount) {
		
		this.setTransactionStatus(EnumTransactionStatus.Accepted);
		this.setReceiverAccount(receiverAccount);
		this.setSenderAccount(senderAccount);
		this.setTitle(title);
		this.setTransactionNumber(FOREIGN_TRANSFER_NUMBER_BASE + transactionCounter);
		this.setAmount(amount);
		this.setTransactionDate(LocalDate.now());
	}

	public Account getSenderAccount() {
		return senderAccount;
	}

	public void setSenderAccount(Account senderAccount) {
		this.senderAccount = senderAccount;
	}

	public BigDecimal getBalanceAfterTransactionSender() {
		return balanceAfterTransactionSender;
	}

	public void setBalanceAfterTransactionSender(BigDecimal balanceAfterTransactionSender) {
		this.balanceAfterTransactionSender = balanceAfterTransactionSender;
	}
}
