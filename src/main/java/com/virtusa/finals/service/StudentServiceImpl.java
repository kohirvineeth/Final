package com.virtusa.finals.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.virtusa.finals.entity.Student;
import com.virtusa.finals.repository.StudentRepository;

import java.util.List;

import javax.transaction.Transactional;




//@repository annotations is used to indicate that the class provides the mechanism for storage,retrieval,search,update,delete operation on objects
@Repository
public class StudentServiceImpl implements StudentService {
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	StudentRepository studentRepository;
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public List<Student> findAll() {

		

		return studentRepository.findAll();
	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public List<Student> findByName(String name) {

		
		return studentRepository.findByName(name);
	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public void save(Student theStudent) {

		studentRepository.save(theStudent);

	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public void deleteById(int id) {

		studentRepository.deleteById(id);

	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public Student findById(int id) {

		

		return studentRepository.findById(id).get();
	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public List<Student> findByNameAndMobile(String name,String mobile)
	{
		
		return studentRepository.findByNameAndMobile(name,mobile);
	}
	

}