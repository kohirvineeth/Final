package com.virtusa.finals.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class CustomUserDetailsTest {
	CustomUserDetails cust = new CustomUserDetails();
	@Test
	@Order(1)
	void customuserdetailstest()
	{
		User user = new User(1,"kvk@gmail.com","vineeth","kohir","kvk");
		CustomUserDetails customuserdetails = new CustomUserDetails(user);
		assertEquals(1,user.getId());
		assertEquals("kvk@gmail.com",user.getEmail());
		assertEquals("vineeth",user.getFirstname());
		assertEquals("kohir",user.getLastname());
		assertEquals("kvk",user.getPassword());
		
		
	}
	@Test
	@Order(2)
	void isaccountantnotexpriedtest()
	{
		assertEquals(true,cust.isAccountNonExpired());
	}
	@Test
	@Order(3)
	void isaccountantnotlockedtest()
	{
		assertEquals(true,cust.isAccountNonLocked());
	}
	@Test
	@Order(4)
	void iscredentialsnonexpiredtest()
	{
		assertEquals(true,cust.isCredentialsNonExpired());
	}
	@Test
	@Order(5)
	void isenabledtest()
	{
		assertEquals(true,cust.isEnabled());
	}
	@Test
	@Order(6)
	void getauthontication()
	{
		assertEquals(null,cust.getAuthorities());
	}
}
