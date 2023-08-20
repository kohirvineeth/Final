package com.virtusa.finals.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import com.virtusa.finals.entity.Admin;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class Testadmincontroller {
	AdminController ac = new AdminController();

	@Test
	@Order(1)
	void showform1test()
	{
		assertEquals("index", ac.showForm1());
	}
	@Test
	@Order(2)
	void showform2test()
	{
		assertEquals("index", ac.showForm2());
	}
	@Test
	@Order(3)
	void savetest()
	{
		Admin admin = new Admin();
		admin.setUsername("admin1");
		admin.setUserpass("admin1");
		assertEquals("ahome",ac.save(admin));
	}
	

	
}
