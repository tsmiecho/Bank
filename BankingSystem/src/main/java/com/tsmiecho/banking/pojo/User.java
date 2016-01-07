package com.tsmiecho.banking.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * User model
 *
 * @author Tomasz Śmiechowicz
 */

@Data
@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String login;

	@Column
	private String password;
	
	@Column(name = "user_role")
	private String userRole;

	@Column
	private String name;

	@Column
	private String surname;

	@Column
	private boolean enabled;

	@Column
	private String address;
	
	@OneToMany(mappedBy = "number", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Account> accounts;
	
}
