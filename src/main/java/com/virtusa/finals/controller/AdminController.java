package com.virtusa.finals.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;


import com.virtusa.finals.entity.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




//@controller annotation indicates that a particular class serves the role of a controlller
@Controller
public class AdminController {
	//logger factory is a utility class producing loggers for various logging APIS
	//getLogger(AdminConroller.class)this method is used to find or create a logger with the  name passed as parameter
	Logger logger = LoggerFactory.getLogger(AdminController.class);
//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods	
	@RequestMapping("/saveadmin")
//@modelattribute annotation binds a method parameter or method return value to a named model attribute and then exposes it to a web view
	public String save(@ModelAttribute("admin")Admin admin){
		
		try
		{
//equalsignorecase() method compares two strings ignoring lower case and upper case differences	
		if(admin.getUsername().equalsIgnoreCase("admin1")&& admin.getUserpass().equalsIgnoreCase("admin1"))
		{
			logger.info("welcome Admin");
			return "ahome";
		}
		

		else{
			logger.info("Sorry! Username or Password Error. plz Enter Correct Detail");
		return "admin";
		
		}
		}
		catch(Exception e)
		{
			return "ERROR IN ADMIN LOGIN";
		}
		
	
	}		
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods		
	@RequestMapping("/admin")
	public String showForm(Model m){
		try
		{
		
	    m.addAttribute("admin", new Admin());
		return "admin";
		}
		catch(Exception e)
		{
			return "ERROR IN ADMIN LOGIN";
		}
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods	
	@RequestMapping("/index")
	public String showForm1(){
		
		return "index";
		
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods	
	@RequestMapping("/home")
	public String showForm2(){
		
		return "index";
		
	}
	


}
