package com.tsmiecho.banking.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Transaction {

	private EnumTransactionStatus transactionStatus;

	private Account receiverAccount;

	private String title;

	private int transactionNumber;

	private BigDecimal amount;

	private BigDecimal balanceAfterTransactionReceiver;

	private LocalDate transactionDate;

	private String receiverName;

	protected String receiverSurname;

	protected String receiverAddress;

	protected static int transactionCounter = 0;

	{
		transactionCounter++;
	}

	public EnumTransactionStatus getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(EnumTransactionStatus transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public Account getReceiverAccount() {
		return receiverAccount;
	}

	public void setReceiverAccount(Account receiverAccount) {
		this.receiverAccount = receiverAccount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public int getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getReceiverSurname() {
		return receiverSurname;
	}

	public void setReceiverSurname(String receiverSurname) {
		this.receiverSurname = receiverSurname;
	}

	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public BigDecimal getBalanceAfterTransactionReceiver() {
		return balanceAfterTransactionReceiver;
	}

	public void setBalanceAfterTransactionReceiver(BigDecimal balanceAfterTransactionReceiver) {
		this.balanceAfterTransactionReceiver = balanceAfterTransactionReceiver;
	}
}
