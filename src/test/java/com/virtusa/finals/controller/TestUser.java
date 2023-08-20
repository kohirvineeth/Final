package com.virtusa.finals.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.virtusa.finals.entity.User;
import com.virtusa.finals.repository.UserRepository;

import static org.assertj.core.api.Assertions.assertThat;

//@springboottest annotation used as an alternative to the standard spring test
@SpringBootTest
//@testmethodorder annotation is used to configure a methodorderer for the test methods of the annotated test class
@TestMethodOrder(OrderAnnotation.class)
class TestUser {
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	UserRepository repo;

	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
	//@order annotation defines the sorting order of an annotated component or bean

	@Test
	@Order(1)
	void savetest()
	{
		User user = new User();
		user.setEmail("sai@gmail.com");
		user.setPassword("sai");
		user.setFirstname("sai");
		user.setLastname("kohir");
		//repo.save(user);
		assertThat(user).isNotNull();
	}
	//@test annotation tells junit that the public void method to which it is attached can be run as a test case
	//@order annotation defines the sorting order of an annotated component or bean
	@Test
	@Order(2)
	void findemailtest()
	{
		String email = "sai@gmail.com";
		User user=repo.findByEmail(email);
		assertThat(user).isNotNull();
	}

}
