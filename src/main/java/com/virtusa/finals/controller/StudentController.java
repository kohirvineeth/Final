package com.virtusa.finals.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtusa.finals.dto.Studentdto;
import com.virtusa.finals.entity.Student;
import com.virtusa.finals.service.StudentService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




//@controller annotation indicates that a particular class serves the role of a controller
@Controller
public class StudentController {
	Logger logger = LoggerFactory.getLogger(StudentController.class); 
	//@autowired annotations can be used to autowire bean on the setter method just like @required annotations,constructor
	@Autowired
	private StudentService studentService;
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods	
	@RequestMapping("/showstudent")
	//@modelattribute annotation binds a method parameter or method return value to a named model attribute and then exposes it to a web view
	public String showstudent(@ModelAttribute("stud")Studentdto student,
			Model theModel) {
		try
		{
	    String name=student.getName();
		List<Student> theStudent = studentService.findByName(name);


		// set Student as a model attribute to pre-populate the form
		theModel.addAttribute("Students", theStudent);

		// send over to our form
		return "liststudent";
		}
		catch(Exception e)
		{
			return "ERROR IN STUDENT FINDBYNAME";
		}
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/list")
	public String listStudents(Model theModel) {
        try
        {
		List<Student> theStudents = studentService.findAll();
		

		// add to the spring model
		theModel.addAttribute("Students", theStudents);

		return "liststudent";
        }
        catch(Exception e)
        {
        	return "ERROR IN STUDENT FINDALL";
        }
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
        try
        {
		Student theStudent = new Student();

		theModel.addAttribute("Student", theStudent);

		return "studentform";
        }
        catch(Exception e)
        {
        	return "ERROR IN STUDENT SHOWFORMFORADD";
        }
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/save")
	//@requestparam is a spring annotaion used to bind a wed request parameter to a method parameter
	public String saveStudent(@RequestParam("id") int id,
			@RequestParam("name") String name,@RequestParam("course") String course,@RequestParam("mobile") String mobile,@RequestParam("feesub") String feesub,@RequestParam("fee") String fee,@RequestParam("paid") String paid,@RequestParam("balance") String balance,@RequestParam("address") String address,@RequestParam("fathername") String fathername,@RequestParam("mothername") String mothername,@RequestParam("dateofbirth") String dateofbirth,@RequestParam("qualification") String qualification,@RequestParam("dateofjoining") String dateofjoining,@RequestParam("description") String description,@RequestParam("trainer") String trainer) {
        logger.info("HI");
		try
		{
		Student theStudent;
		if(id!=0)
		{
			theStudent=studentService.findById(id);
			theStudent.setName(name);
			theStudent.setCourse(course);
			theStudent.setMobile(mobile);
			theStudent.setFeesub(feesub);
			theStudent.setFee(fee);
			theStudent.setPaid(paid);
			theStudent.setBalance(balance);
			theStudent.setAddress(address);
			theStudent.setFathername(fathername);
			theStudent.setMothername(mothername);
			theStudent.setDateofbirth(dateofbirth);
			theStudent.setQualification(qualification);
			theStudent.setDateofjoining(dateofjoining);
			theStudent.setDescription(description);
			theStudent.setTrainer(trainer);
		}
		else
			theStudent=new Student(id,name,course,mobile,feesub,fee,paid,balance,address,fathername,mothername,dateofbirth,qualification,dateofjoining,description,trainer);
		// save the Student Record
		studentService.save(theStudent);


		// use a redirect to prevent duplicate submissions
		return "redirect:/list";
		}
		catch(Exception e)
		{
			return "ERROR IN STUDENT SAVE DEATAILS";
		}
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/showFormForUpdate")
	//@requestparam is a spring annotaion used to bind a wed request parameter to a method parameter
	public String showFormForUpdate(@RequestParam("studentId") int id,
			Model theModel) {
		try
		{
		Student theStudent = studentService.findById(id);


		// set Student as a model attribute to pre-populate the form
		theModel.addAttribute("Student", theStudent);

		// send over to our form
		return "studentform";		
		}
		catch(Exception e)
		{
			return "ERROR IN STUDENT SHOWFORMFORUPDATE";
		}
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/delete")
	//@requestparam is a spring annotaion used to bind a wed request parameter to a method parameter
	public String delete(@RequestParam("studentId") int id) {

		try
		{
		studentService.deleteById(id);

		// redirect to /student/list
		return "redirect:/list";
		}
		catch(Exception e)
		{
			return "ERROR IN STUDENT DELETEBYID";
		}
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/studentlogin")
	public String showForm(Model m){
		m.addAttribute("student", new Student());
		
		return "student";
		
	}
	//@requestmapping annotation used to map web requests onto specific handler classes and/or handler methods
	@RequestMapping("/studentloginprocess")
	//@modelattribute annotation binds a method parameter or method return value to a named model attribute and then exposes it to a web view
	public String afind(@ModelAttribute("student")Studentdto student){
		try
		{
		String name = student.getName();
		String mobile = student.getMobile();
		List<Student> studList=studentService.findByNameAndMobile(name,mobile);
		//equalsignorecase() method compares two strings ignoring lower case and upper case differences
		if(studList.get(0).getName().equalsIgnoreCase(name) && studList.get(0).getMobile().equalsIgnoreCase(mobile)){
			logger.info(" welcome Student");
			return "studhome";
			}
			else{
			logger.info(" some thing went wrong");
			return "index";
			
			}
		}
		catch(Exception e)
		{
			return "ERROR IN STUDENT LOGIN";
		}

}
}
