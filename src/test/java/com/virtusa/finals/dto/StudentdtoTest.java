package com.virtusa.finals.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class StudentdtoTest {
Studentdto studto = new Studentdto();
@Test
@Order(1)
void teststudentsetname1()
{
	studto.setName("vineeth");
	assertEquals("vineeth",studto.getName());
}
@Test
@Order(2)
void teststudentsetmobile1()
{
	studto.setMobile("9160472414");
	assertEquals("9160472414",studto.getMobile());
}
}
