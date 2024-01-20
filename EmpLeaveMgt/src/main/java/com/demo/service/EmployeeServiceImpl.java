package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao edao;

	@Override
	public List<Employee> getAllEmployees() {
		
		return edao.findAll();
	}

	@Override
	public void insertleavedetails(Employee e) {
		edao.save(e);
	}

//	@Override
//	public Employee getById(int id) {
//		 Optional<Employee> op=edao.findById(id);
//		 if(op.isPresent()) {
//			 return op.get();
//		 }
//		 return null;
//	}


}
