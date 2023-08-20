package com.virtusa.finals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.virtusa.finals.dto.Payregisterdto;
import com.virtusa.finals.entity.Payregister;
import com.virtusa.finals.service.PayregisterService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@controller annotation indicates that a particular class serves the role of a controller
@Controller
public class PayregisterController {
	Logger logger = LoggerFactory.getLogger(PayregisterController.class); 
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	private PayregisterService payregisterservice;
	
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods		
	@RequestMapping("/loginprocess")
	//@modelattribute annotation binds a method parameter or method return value to a named model attribute and then exposes it to a web view
	public String afind(@ModelAttribute("payregister")Payregisterdto pay){
		try
		{
		String username = pay.getUsername();
		String userpass = pay.getUserpass();
		String branch = pay.getBranch();
		List<Payregister> payList=payregisterservice.findByUsernameAndUserpassAndBranch(username,userpass, branch);
		//equalsignorecase() method compares two strings ignoring lower case and upper case differences	
		if(payList.get(0).getUsername().equalsIgnoreCase(username)&& payList.get(0).getUserpass().equalsIgnoreCase(userpass)&& payList.get(0).getBranch().equalsIgnoreCase(branch)){
			logger.info(" welcome Accountant");
			return "home";
			}
			else{
			logger.info(" some thing went wrong");
			return "index";
			
			}
		}
		catch(Exception e)
		{
			return "ERROR IN ACCOUNTANT LOGIN";
		}

}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/editsavepay")
	//@modelattribute annotation binds a method parameter or method return value to a named model attribute and then exposes it to a web view
	public String afindbyname(@ModelAttribute("payregister")Payregisterdto payreg,Model theModel){
try {
	    
		String username = payreg.getUsername();
		String branch = payreg.getBranch();
		List<Payregister> payList=payregisterservice.findByUsernameAndBranch(username,branch);
		theModel.addAttribute("payregisters", payList);
		return "listpayregister";
}
catch(Exception e)
{
	return "ERROR IN ACCOUNTANT FINDBYUSERNAMEBRANCH";
}
}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/view")
	public String listpayregisters(Model theModel) {
        try
        {
		List<Payregister> payList = payregisterservice.findAll();
		

		// add to the spring model
		theModel.addAttribute("payregisters", payList);

		return "listpayregister";
        }
        catch(Exception e)
        {
        	return "ERROR IN ACCOUNTATN FINDALL";
        }
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/showFormForAddPayregister")
	public String showFormForAddPayregister(Model theModel) {

		try
		{
		Payregister payregister = new Payregister();

		theModel.addAttribute("payregister", payregister);

		return "payregisterform";
		}
		catch(Exception e)
		{
			return "ERROR IN ACCOUNTANT SHOWFORMFORADDPAYREGISTER";
		}
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/create")
	//@requestparam is a spring annotaion used to bind a wed request parameter to a method parameter
	public String savePayregister(@RequestParam("id") int id,
			@RequestParam("username") String username,@RequestParam("userpass") String userpass,@RequestParam("branch") String branch,@RequestParam("dateofjoining") String dateofjoining,@RequestParam("dateofbirth") String dateofbirth,@RequestParam("salary") String salary) {
       try
       {
		logger.info("HI");
		
		Payregister payregister;
		if(id!=0)
		{
			payregister=payregisterservice.findById(id);
			payregister.setUsername(username);
			payregister.setUserpass(userpass);
			payregister.setBranch(branch);
			payregister.setDateofjoining(dateofjoining);
			payregister.setDateofbirth(dateofbirth);
			payregister.setSalary(salary);
			
		}
		else
			payregister=new Payregister(id,username,userpass,branch,dateofjoining,dateofbirth,salary);
		// save the Student Record
		payregisterservice.save(payregister);


		// use a redirect to prevent duplicate submissions
		return "redirect:/view";
       }
       catch(Exception e)
       {
    	   return "ERROR IN ACCOUNTANT SAVE DETAILS";
       }
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/showFormForUpdatePayregister")
	//@requestparam is a spring annotaion used to bind a wed request parameter to a method parameter
	public String showFormForUpdate(@RequestParam("payregisterId") int id,
			Model theModel) {

		try
		{
		Payregister payregister = payregisterservice.findById(id);


		// set Student as a model attribute to pre-populate the form
		theModel.addAttribute("payregister", payregister);

		// send over to our form
		return "payregisterform";	
		}
		catch(Exception e)
		{
			return "ERROR IN ACCOUNTANT FINDBYID";
		}
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/deletePayregister")
	//@requestparam is a spring annotaion used to bind a wed request parameter to a method parameter
	public String delete(@RequestParam("payregisterId") int id) {
        try
        {
		payregisterservice.deleteById(id);

		// redirect to /student/list
		return "redirect:/view";
        }
        catch(Exception e)
        {
        	return "ERROR IN ACCOUNTANT DELETEBYID";
        }
	}

	
}
