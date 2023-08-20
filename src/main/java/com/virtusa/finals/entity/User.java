package com.virtusa.finals.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//@entity annotation specifies that the class is an entity and is mapped to a database table
@Entity
//@table annotation allows you to specify the details of the table that will be used to persist the entity in the database
@Table(name = "users")
public class User {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	//@id annotation specifies the primary key of an entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	public String getPassword() {
		return password;
	}
	public User() {
		super();
	}
	
	public User(int id, String email, String firstname, String lastname, String password) {
		super();
		this.id = id;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
