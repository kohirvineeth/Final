package com.virtusa.finals.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class PayregisterTest {
	Payregister payregister = new Payregister();
	
	@Test
	@Order(1)
	 void setidtest()
	{
		payregister.setId(1);
		assertEquals(1,payregister.getId());
	}
	@Test
	@Order(2)
	 void setusernametest()
	{
		payregister.setUsername("vineeth");
		assertEquals("vineeth",payregister.getUsername());
	}
	@Test
	@Order(3)
	 void setpasswordtest()
	{
		payregister.setUserpass("kohir");
		assertEquals("kohir",payregister.getUserpass());
	}
	@Test
	@Order(4)
	 void setbranchtest()
	{
		payregister.setBranch("Hyderabad");
		assertEquals("Hyderabad",payregister.getBranch());
	}
	@Test
	@Order(5)
	 void setdateofjoiningtest()
	{
		payregister.setDateofjoining("2022-09-09");
		assertEquals("2022-09-09",payregister.getDateofjoining());
	}
	@Test
	@Order(6)
	 void setdateofbirthtest()
	{
		payregister.setDateofbirth("2000-11-27");
		assertEquals("2000-11-27",payregister.getDateofbirth());
	}
	@Test
	@Order(7)
	 void setsalarytest()
	{
		payregister.setSalary("35000");;
		assertEquals("35000",payregister.getSalary());
	}
}
