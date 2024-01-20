package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void addnewemployee(Employee e);
//
	Employee getById(int id);

	void updateById(Employee e);
//
	void deleteById(int id);

}
