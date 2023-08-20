package com.virtusa.finals.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class AdminTest {
 Admin admin = new Admin();
 @Test
	@Order(1)
 void testadminsetusername()
 {
	 admin.setUsername("admin1");
	 assertEquals("admin1",admin.getUsername());
 }
 @Test
	@Order(2)
 void testadminsetpassword()
 {
	 admin.setUserpass("admin1");
	 assertEquals("admin1",admin.getUserpass());
 }

}
