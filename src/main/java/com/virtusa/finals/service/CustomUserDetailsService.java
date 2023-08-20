package com.virtusa.finals.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.virtusa.finals.entity.CustomUserDetails;
import com.virtusa.finals.entity.User;
import com.virtusa.finals.repository.UserRepository;



public class CustomUserDetailsService implements UserDetailsService {
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	private UserRepository repo;
	//@override annotation indicates that the child class method is over writing its base class method
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = repo.findByEmail(email);
		if(user == null)
		{
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomUserDetails(user);
	}

}
