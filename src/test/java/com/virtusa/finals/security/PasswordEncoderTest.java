package com.virtusa.finals.security;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class PasswordEncoderTest {
	@Test
	@Order(1)
	void passwordencodertest()
	{
		PasswordEncoder pet =new PasswordEncoder();
		
		
	}
	

}
