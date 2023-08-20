package com.virtusa.finals.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.finals.entity.Payregister;

public interface PayregisterRepository extends JpaRepository<Payregister, Integer> {
	public List<Payregister> findByUsernameAndUserpassAndBranch(String username,String userpass,String branch);
	public List<Payregister> findByUsernameAndBranch(String username,String branch);

}
