package com.virtusa.finals.service;

import java.util.List;

import com.virtusa.finals.entity.Payregister;


public interface PayregisterService {
	public List<Payregister> findByUsernameAndUserpassAndBranch(String username,String userpass,String branch);
	public List<Payregister> findByUsernameAndBranch(String username,String branch);
	public List<Payregister> findAll();
	public Payregister findById(int id);
	public void deleteById(int id);
	public void save(Payregister payregister);
}
