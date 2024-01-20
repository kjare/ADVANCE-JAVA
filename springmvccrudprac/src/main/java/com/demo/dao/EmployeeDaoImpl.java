package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
   @Autowired
   private JdbcTemplate jdbcTemplate;

public List<Employee> findAllEmployees() {
	return jdbcTemplate.query("select * from Employee", (rs,num)->{
		Employee e=new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setEmail(rs.getString(3));
		e.setSalary(rs.getDouble(4));
		return e;
	});
}
//
@Override
public void save(Employee e) {
	String str="insert into employee values(?,?,?,?)";
	jdbcTemplate.update(str,new Object[] {e.getId(),
			e.getName(),e.getEmail(),e.getSalary()});
	
}

@Override
public Employee findById(int id) {
	try {
	    return jdbcTemplate.queryForObject("select * from Employee where id=?",new Object[] {id},BeanPropertyRowMapper.newInstance(Employee.class));
	}catch(EmptyResultDataAccessException e) {
		return null;
	}
	
}

@Override
public void modifyEmployee(Employee e) {
	jdbcTemplate.update("update Employee set name=?,email=?,salary=? where id=?",
			new Object[] {e.getName(),e.getEmail(),e.getSalary(),e.getId()});
	
}
//
@Override
public void removeById(int id) {
	jdbcTemplate.update("delete from employee where id=?",new Object[] {id});
	
}    
}
