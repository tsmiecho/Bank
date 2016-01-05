package com.tsmiecho.banking.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {
	
	private LocalDate creatingDate;
	private String number;
	private LocalDate closingDate;
	private String country;
	private BigDecimal balance;
	private String swift;
	private static int accountNumberCounter = 1000;

	public Account(String country, BigDecimal balance) {
		this.setBalance(balance);
		this.closingDate = LocalDate.now();
		this.country = country;
		this.creatingDate = LocalDate.now();
		this.setNumber("00 5700 0000 " + accountNumberCounter);
		accountNumberCounter++;
		this.setSwift("ACCBTPLX");
	}

	public Account(String country, BigDecimal balance, String swift) {
		this.setBalance(balance);
		this.closingDate = LocalDate.now();
		this.country = country;
		this.creatingDate = LocalDate.now();
		this.setNumber("00 5700 0000 " + accountNumberCounter);
		accountNumberCounter++;
		this.setSwift(swift);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSwift() {
		return swift;
	}

	public void setSwift(String swift) {
		this.swift = swift;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
    public LocalDate getCreatingDate() {
    	return creatingDate;
    }

	
    public void setCreatingDate(LocalDate creatingDate) {
    	this.creatingDate = creatingDate;
    }

	
    public LocalDate getClosingDate() {
    	return closingDate;
    }

	
    public void setClosingDate(LocalDate closingDate) {
    	this.closingDate = closingDate;
    }
}
