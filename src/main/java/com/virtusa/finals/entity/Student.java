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
@Table(name="student")
public class Student {
	//@id annotation specifies the primary key of an entity
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private int id;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String name;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String course;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String mobile;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String feesub;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String fee;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String paid;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String balance;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String address;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String fathername;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String mothername;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String dateofbirth;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String qualification;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String dateofjoining;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String description;
	//@column annotation is used for adding the column the name in the table of a particular mysql database
	@Column
	private String trainer;
	public Student()
	{
		
	}
	public Student(int id, String name, String course, String mobile, String feesub, String fee, String paid,
			String balance, String address, String fathername, String mothername, String dateofbirth,
			String qualification, String dateofjoining, String description, String trainer) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.mobile = mobile;
		this.feesub = feesub;
		this.fee = fee;
		this.paid = paid;
		this.balance = balance;
		this.address = address;
		this.fathername = fathername;
		this.mothername = mothername;
		this.dateofbirth = dateofbirth;
		this.qualification = qualification;
		this.dateofjoining = dateofjoining;
		this.description = description;
		this.trainer = trainer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFeesub() {
		return feesub;
	}
	public void setFeesub(String feesub) {
		this.feesub = feesub;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getPaid() {
		return paid;
	}
	public void setPaid(String paid) {
		this.paid = paid;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDateofjoining() {
		return dateofjoining;
	}
	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	
	

}
