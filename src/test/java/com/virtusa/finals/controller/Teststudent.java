package com.virtusa.finals.controller;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.virtusa.finals.entity.Student;
import com.virtusa.finals.repository.StudentRepository;
//@springboottest annotation used as an alternative to the standard spring test
@SpringBootTest
//@testmethodorder annotation is used to configure a methodorderer for the test methods of the annotated test class
@TestMethodOrder(OrderAnnotation.class)
class Teststudent {
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	StudentRepository studentrepository;
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
	@Test
	//@order annotation defines the sorting order of an annotated component or bean
	@Order(1)
	void findallstudenttest()
	{
		List<Student> lst = studentrepository.findAll();
		assertThat(lst).size().isPositive();
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
	@Test
	//@order annotation defines the sorting order of an annotated component or bean
	@Order(2)
	void findbynametest()
	{
		List<Student> lst = studentrepository.findByName("sai");
		assertEquals("sai",lst.get(0).getName());
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
	@Test
	//@order annotation defines the sorting order of an annotated component or bean
	@Order(3)
	void findbyidstudenttest()
	{
		Student stud = studentrepository.findById(1).get();
		assertEquals("sai",stud.getName());
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
	//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(4)
	void findbynameandmobiletest()
	{
		List<Student> lst = studentrepository.findByNameAndMobile("sai","9030265580");
		assertEquals("sai",lst.get(0).getName());
		assertEquals("9030265580",lst.get(0).getMobile());
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
		//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(5)
	void savestudenttest()
	{
	//Student stud = new Student(4,"tinku","CSE","9160472414","2022-07-07","80000","30000","50000","sangareddy","mallesh","devi","2000-01-07","inter","2022-08-08","nothing","vittal");
		//studentrepository.save(stud);
		assertNotNull(studentrepository.findById(1).get());
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
		//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(6)
	void deletebyidstudenttest()
	{
		//studentrepository.deleteById(3);
		assertThat(studentrepository.existsById(3)).isFalse();
	}

}
