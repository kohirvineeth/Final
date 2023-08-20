package com.virtusa.finals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.virtusa.finals.entity.Payregister;
import com.virtusa.finals.entity.User;
import com.virtusa.finals.repository.PayregisterRepository;

@SpringBootTest
class FinalApplicationTests {

	
User user = new User();
	@Test
	void contextLoads() {
		assertThat(user).isNull();
	}

	
	
	
	
	

}
