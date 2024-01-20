package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {

	List<Employee> findAllEmployees();

	void save(Employee e);
//
	Employee findById(int pid);

	void modifyEmployee(Employee e);
//
	void removeById(int id);

}
