package com.virtusa.finals.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class StudentTest {
Student stud = new Student();
@Test
@Order(1)
void teststudentsetid()
{
	stud.setId(1);
	assertEquals(1,stud.getId());
}
@Test
@Order(2)
void teststudentsetname()
{
	stud.setName("vineeth");
	assertEquals("vineeth",stud.getName());
}
@Test
@Order(3)
void teststudentsetcourse()
{
	stud.setCourse("ECE");
	assertEquals("ECE",stud.getCourse());
}	
@Test
@Order(4)
void teststudentsetmobile()
{
	stud.setMobile("9160472414");
	assertEquals("9160472414",stud.getMobile());
}
@Test
@Order(5)
void teststudentsetfeesub()
{
	stud.setFeesub("2022-08-08");
	assertEquals("2022-08-08",stud.getFeesub());
}
@Test
@Order(6)
void teststudentsetfee()
{
	stud.setFee("80000");
	assertEquals("80000",stud.getFee());
}
@Test
@Order(7)
void teststudentsetpaid()
{
	stud.setPaid("80000");
	assertEquals("80000",stud.getPaid());
}
@Test
@Order(8)
void teststudentsetbalance()
{
	stud.setBalance("0");;
	assertEquals("0",stud.getBalance());
}
@Test
@Order(9)
void teststudentsetaddress()
{
	stud.setAddress("kandi");;
	assertEquals("kandi",stud.getAddress());
}
@Test
@Order(10)
void teststudentsetfathername()
{
	stud.setFathername("santosh");
	assertEquals("santosh",stud.getFathername());
}
@Test
@Order(11)
void teststudentsetmothername()
{
	stud.setMothername("manjula");
	assertEquals("manjula",stud.getMothername());
}
@Test
@Order(12)
void teststudentsetdateofbirth()
{
	stud.setDateofbirth("2000-11-27");
	assertEquals("2000-11-27",stud.getDateofbirth());
}
@Test
@Order(13)
void teststudentsetqualification()
{
	stud.setQualification("inter");
	assertEquals("inter",stud.getQualification());
}
@Test
@Order(14)
void teststudentsetdateofjoining()
{
	stud.setDateofjoining("2022-08-08");
	assertEquals("2022-08-08",stud.getDateofjoining());
}
@Test
@Order(15)
void teststudentsetdescription()
{
	stud.setDescription("nothing");
	assertEquals("nothing",stud.getDescription());
}
@Test
@Order(16)
void teststudentsettrainer()
{
	stud.setTrainer("vittal");
	assertEquals("vittal",stud.getTrainer());
}
}
