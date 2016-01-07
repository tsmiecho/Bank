package com.tsmiecho.banking.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
 * Bank account model
 *
 * @author Tomasz Śmiechowicz
 */

@Data
@Entity
public class Account {

	@Id
	private String number;

	@ManyToOne
	private User owner;

}
