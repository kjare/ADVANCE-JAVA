package com.demo.model;



public class Employee {
	
	
	private int Id;
	private String Name;
	private String Email;
	private double Salary;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String email, double salary) {
		super();
		Id = id;
		Name = name;
		Email = email;
		Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Salary=" + Salary + "]";
	}
	
	
	


}
