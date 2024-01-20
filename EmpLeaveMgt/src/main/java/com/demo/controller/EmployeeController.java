package com.demo.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;
//import com.demo.service.EmployeeService;
import com.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	 @Autowired
	 EmployeeService eservice;
	 
	@GetMapping("/index")
	public String indexPage()
	{
	return "index";				

	}

	@GetMapping("/index/applyleave")
	public String leavePage()
	{
	return "applyleave";				
	}
	
	
//	@GetMapping("/getemployees")
//	public ModelAndView getemployees(HttpSession session)
//	{
//		List<Employee> elist=eservice.getAllEmployees();
//		return new ModelAndView("displayemployee","elist",elist);				
//				
//	}
//	


//	int empno, Date startdate, Date enddate, String leavetype, String leavereason
	@PostMapping("/index/applyleave/insertleavedetails/")
	public ModelAndView insertleavedetails(@RequestParam int empno,@RequestParam Date startdate,@RequestParam Date enddate,@RequestParam String leavetype,@RequestParam String leavereason)
	{
		Employee e=new Employee(empno,enddate,leavetype,leavereason,startdate);
		eservice.insertleavedetails(e);
		return new ModelAndView("redirect:/index/");
	}
//	





}
