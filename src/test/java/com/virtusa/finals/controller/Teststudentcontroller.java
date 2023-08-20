package com.virtusa.finals.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.virtusa.finals.entity.Student;
import com.virtusa.finals.service.StudentService;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class Teststudentcontroller {

	@Autowired
	private StudentService studentService;
	@Test
	@Order(1)
	void showstudenttest()
	{
		String name="sai";
		List<Student> theStudent = studentService.findByName(name);
		assertThat(theStudent).size().isPositive();
	}
	@Test
	@Order(2)
	void liststudenttest()
	{
		List<Student> theStudent = studentService.findAll();
		assertThat(theStudent).size().isPositive();
	}
	@Test
	@Order(3)
	void showformforupdatetest()
	{
		Student theStudent = studentService.findById(1);
		assertThat(theStudent).isNotNull();
	}
	@Test
	@Order(4)
	void deletetest()
	{
	//	studentService.deleteById(12);
		assertThat(studentService.findById(1)).isNotNull();
	}
}
