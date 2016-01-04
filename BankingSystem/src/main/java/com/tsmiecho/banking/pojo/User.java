package com.tsmiecho.banking.pojo;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String surname;
	private String address;
	private String ssn; 
	private String idNumber;
	private List<Account> accountsList;
	private List<Account> closedAccountsList;

	public User(String name, String idNumber, String ssn) {
		this.setName(name);
		this.setIdNumber(idNumber);
		this.setSsn(ssn);
		setAccountsList(new ArrayList<Account>());
		setClosedAccountsList(new ArrayList<Account>());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public List<Account> getAccountsList() {
		return accountsList;
	}

	private void setAccountsList(List<Account> accountsList) {
		this.accountsList = accountsList;
	}

	public String getSsn() {
		return ssn;
	}

	private void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public List<Account> getClosedAccountsList() {
		return closedAccountsList;
	}

	private void setClosedAccountsList(List<Account> closedAccountsList) {
		this.closedAccountsList = closedAccountsList;
	}

}
