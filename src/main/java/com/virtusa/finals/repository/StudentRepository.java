package com.virtusa.finals.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.finals.entity.*;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	public List<Student> findByNameAndMobile(String name,String mobile);
	public List<Student> findByName(String name);

}
