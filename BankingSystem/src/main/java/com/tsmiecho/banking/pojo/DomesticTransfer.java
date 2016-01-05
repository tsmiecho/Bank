package com.tsmiecho.banking.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DomesticTransfer extends Transaction implements Itransfer {

	private static final int DOMESTIC_TRANSFER_NUMBER_BASE = 10000;

	private Account senderAccount;

	private BigDecimal balanceAfterTransactionSender;

	public DomesticTransfer(Account receiverAccount, Account senderAccount, String title, BigDecimal amount) {
		
		this.setTransactionStatus(EnumTransactionStatus.Accepted);
		this.setReceiverAccount(receiverAccount);
		this.setSenderAccount(senderAccount);
		this.setTitle(title);
		this.setTransactionNumber(DOMESTIC_TRANSFER_NUMBER_BASE + transactionCounter);
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
