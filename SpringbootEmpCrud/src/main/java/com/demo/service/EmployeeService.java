package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();

	void addnewemployee(Employee e);

	Employee getById(int id);

	void updateById(Employee employee);

	void deleteById(int id);

	List<Employee> getBySalary(int lpr, int hpr);

}
