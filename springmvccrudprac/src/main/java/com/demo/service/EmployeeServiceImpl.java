package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	 private EmployeeDao edao;

	public List<Employee> getAllEmployees() {
		return edao.findAllEmployees();
	}

	
	public void addnewemployee(Employee e) {
		edao.save(e);
		
	}


	

	@Override
	public Employee getById(int id) {
		return edao.findById(id);
	}

	@Override
	public void updateById(Employee e) {
		edao.modifyEmployee(e);
		
	}

	@Override
	public void deleteById(int id) {
		edao.removeById(id);
		
	}

}
