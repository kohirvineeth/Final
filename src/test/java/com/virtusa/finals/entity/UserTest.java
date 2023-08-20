package com.virtusa.finals.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserTest {

	User user = new User();
	@Test
	@Order(1)
	void testuserid()
	{
		user.setId(1);
		assertEquals(1,user.getId());
	}

	@Test
	@Order(2)
	void testuserfirstname()
	{
		user.setFirstname("vineeth");
		assertEquals("vineeth",user.getFirstname());
	}
	@Test
	@Order(3)
	void testuserlastname()
	{
		user.setLastname("kohir");;
		assertEquals("kohir",user.getLastname());
	}
	@Test
	@Order(4)
	void testuseremail()
	{
		user.setEmail("kvk@gmail.com");;
		assertEquals("kvk@gmail.com",user.getEmail());
	}
	@Test
	@Order(5)
	void testuserpassword()
	{
		user.setPassword("kvk");;
		assertEquals("kvk",user.getPassword());
	}
}
