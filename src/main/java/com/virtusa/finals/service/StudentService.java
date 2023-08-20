package com.virtusa.finals.service;

import java.util.List;

import com.virtusa.finals.entity.Student;




public interface StudentService {
	public List<Student> findAll();
	public List<Student> findByNameAndMobile(String name,String mobile);
	public List<Student> findByName(String name);
	public Student findById(int id);

	public void save(Student thestudent);

	public void deleteById(int id);

	

}