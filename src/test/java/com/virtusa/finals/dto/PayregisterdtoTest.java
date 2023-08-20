package com.virtusa.finals.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class PayregisterdtoTest {
Payregisterdto paydto = new Payregisterdto();
	
@Test
@Order(1)
 void setusernametest1()
{
	paydto.setUsername("vineeth");
	assertEquals("vineeth",paydto.getUsername());
}
@Test
@Order(2)
 void setpasswordtest1()
{
	paydto.setUserpass("kohir");
	assertEquals("kohir",paydto.getUserpass());
}
@Test
@Order(3)
 void setbranchtest1()
{
	paydto.setBranch("Hyderabad");
	assertEquals("Hyderabad",paydto.getBranch());
}
}
