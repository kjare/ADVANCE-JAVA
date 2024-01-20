package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

    @Query(value="select * from emptab where salary between :lpr and :hpr",nativeQuery = true)
	List<Employee> findbySalary(int lpr, int hpr);
	
	

}
