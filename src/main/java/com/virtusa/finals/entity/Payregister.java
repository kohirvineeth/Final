package com.virtusa.finals.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//@entity annotation specifies that the class is an entity and is mapped to a database table
@Entity
//@table annotation allows you to specify the details of the table that will be used to persist the entity in the database
@Table(name="payregister")
public class Payregister {
	//@id annotation specifies the primary key of an entity
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
    private int id;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
    private String username;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
    private String userpass;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
    private String branch;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
    private String dateofjoining;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
    private String dateofbirth;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
    private String salary;
	
	
	
public Payregister() {
		super();

	}

public Payregister(int id, String username, String userpass, String branch, String dateofjoining, String dateofbirth,
		String salary) {
	super();
	this.id = id;
	this.username = username;
	this.userpass = userpass;
	this.branch = branch;
	this.dateofjoining = dateofjoining;
	this.dateofbirth = dateofbirth;
	this.salary = salary;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpass() {
	return userpass;
}
public void setUserpass(String userpass) {
	this.userpass = userpass;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getDateofjoining() {
	return dateofjoining;
}
public void setDateofjoining(String dateofjoining) {
	this.dateofjoining = dateofjoining;
}
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}





}
