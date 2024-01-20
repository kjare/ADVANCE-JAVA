package com.demo.controller;

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
import com.demo.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService eservice;
	
	@GetMapping("/getemployees")
	public ModelAndView getemployees(HttpSession session)
	{
		List<Employee> elist=eservice.getAllEmployees();
		return new ModelAndView("displayemployee","elist",elist);				
				
	}
	
	@GetMapping("/addemployee")
	public String addemployee(HttpSession session)
	{
		return "addemployee";
	}
	
	@PostMapping("/insertemployee")
	public ModelAndView insertemployee(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam double salary)
	{
		Employee e=new Employee(id,name,email,salary);
		eservice.addnewemployee(e);
		return new ModelAndView("redirect:/employee/getemployees");
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView editemployee(@PathVariable("id") int id) {
		Employee e=eservice.getById(id);
		return new ModelAndView("editemployee","e",e);
		
	}
	
	@PostMapping("/updateemployee")
	public ModelAndView updateemployee(@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam double salary){
		eservice.updateById(new Employee(id,name,email,salary));
		return new ModelAndView("redirect:/employee/getemployees");
	}
	
	@GetMapping("delete/{id}")
	public ModelAndView deleteemployee(@PathVariable int id) {
		eservice.deleteById(id);
		return new ModelAndView("redirect:/employee/getemployees");
	}
	

}
