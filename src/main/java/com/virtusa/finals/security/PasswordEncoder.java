package com.virtusa.finals.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PasswordEncoder {
	
	public static void main (String[] args)
	{
		//logger factory is a utility class producing loggers for various logging APIS
		//getLogger(PasswordEncoder.class)this method is used to find or create a logger with the  name passed as parameter
		Logger logger = LoggerFactory.getLogger(PasswordEncoder.class);
		//the api class is Bcrypt password encoder we have to use this class to encode our password into a hash string
		//we also use this class to verify your password against an encoded value and the algorithm implementation class is Bcrypt encoded password
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		 String rawPassword = "sai";
		String encodedPassword = encoder.encode(rawPassword);
		logger.info(encodedPassword);
	}
}
