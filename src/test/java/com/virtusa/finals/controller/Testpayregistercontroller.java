package com.virtusa.finals.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.virtusa.finals.entity.Payregister;
import com.virtusa.finals.service.PayregisterService;
import com.virtusa.finals.service.PayregisterServiceImp1;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class Testpayregistercontroller {
	@Autowired
	private PayregisterService payregisterservice;
	
	@Test
	@Order(1)
	void afindtest()
	{
		String username = "balram";
		String userpass = "krishna";
		String branch = "Hyderabad";
		List<Payregister> payList= payregisterservice.findByUsernameAndUserpassAndBranch(username,userpass, branch);
		assertThat(payList).size().isPositive();
	}
	@Test
	@Order(2)
	void afindbynametest()
	{
		String username = "balram";
		String branch = "Hyderabad";
		List<Payregister> payList= payregisterservice.findByUsernameAndBranch(username,branch);
		assertThat(payList).size().isPositive();
	}
	@Test
	@Order(3)
	void listpayregistertest()
	{
		List<Payregister> payList = payregisterservice.findAll();
		assertThat(payList).size().isPositive();
	}
	@Test
	@Order(4)
	void showformforupdatetest()
	{
		Payregister payregister =  payregisterservice.findById(1);
		assertNotNull(payregisterservice.findById(1));
	}

	

}
