package com.virtusa.finals.controller;

import static org.junit.Assert.assertNotNull;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.virtusa.finals.entity.Payregister;
import com.virtusa.finals.repository.PayregisterRepository;
//@springboottest annotation used as an alternative to the standard spring test
@SpringBootTest
//@testmethodorder annotation is used to configure a methodorderer for the test methods of the annotated test class
@TestMethodOrder(OrderAnnotation.class)
class Testpayregistser {
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	PayregisterRepository payregisterrepository;


	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
			//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(1)
	void savetest()
	{
		//Payregister pay = new Payregister(2,"vineeth","kohir","Hyderabad","2022-07-11","2000-11-27","35000");
		//payregisterrepository.save(pay);
		assertNotNull(payregisterrepository.findById(1).get());
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
			//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(2)
	void findalltest()
	{
		List<Payregister> lst = payregisterrepository.findAll();
		assertThat(lst).size().isPositive();
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
			//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(3)
	void findbyidtest()
	{
		Payregister pay =payregisterrepository.findById(1).get();
		assertEquals("balram",pay.getUsername());
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
			//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(4)
	void deletebyidtest()
	{
		//payregisterrepository.deleteById(7);
	    assertThat(payregisterrepository.existsById(7)).isFalse();
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
			//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(5)
	void findByUsernameAndUserpassAndBranchtest()
	{
		List<Payregister> list = payregisterrepository.findByUsernameAndUserpassAndBranch("vineeth", "kohir", "Hyderabad");
		assertEquals("vineeth",list.get(0).getUsername());
		assertEquals("kohir",list.get(0).getUserpass());
		assertEquals("Hyderabad",list.get(0).getBranch());
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
			//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(6)
	void findByUsernameAndBranchtest()
	{
		List<Payregister> list = payregisterrepository.findByUsernameAndBranch("vineeth","Hyderabad");
		assertEquals("vineeth",list.get(0).getUsername());
		assertEquals("Hyderabad",list.get(0).getBranch());
	}
	
	
}
