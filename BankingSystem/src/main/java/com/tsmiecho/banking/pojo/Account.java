package com.tsmiecho.banking.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Bank account model
 *
 * @author Tomasz Śmiechowicz
 */
@Entity
public class Account {

	@Id
	private String number;

	@ManyToOne
	private User owner;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

}
