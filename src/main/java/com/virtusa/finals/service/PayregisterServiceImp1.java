package com.virtusa.finals.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.finals.entity.Payregister;
import com.virtusa.finals.repository.PayregisterRepository;
//@repository annotations is used to indicate that the class provides the mechanism for storage,retrieval,search,update,delete operation on objects
@Repository
public class PayregisterServiceImp1 implements PayregisterService {
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	PayregisterRepository payregisterrepository;
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public List<Payregister> findByUsernameAndUserpassAndBranch(String username,String userpass,String branch)
	{	
		return payregisterrepository.findByUsernameAndUserpassAndBranch(username, userpass, branch);
		
		
	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public List<Payregister> findByUsernameAndBranch(String username,String branch)
	{
	
		return payregisterrepository.findByUsernameAndBranch(username,branch);
	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public List<Payregister> findAll() {


		return payregisterrepository.findAll();
	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public Payregister findById(int id) {


		return payregisterrepository.findById(id).get();
	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public void save(Payregister payregister) {

		payregisterrepository.save(payregister);

	}
	//@transactional annotation is the metadata that specifies the semantics of the transactions on a method
	@Transactional
	public void deleteById(int id) {

		payregisterrepository.deleteById(id);

	}
	
}
