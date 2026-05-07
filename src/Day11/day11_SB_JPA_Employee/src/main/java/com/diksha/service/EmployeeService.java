package com.diksha.service;

import java.util.List;

import com.diksha.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee e);
	
	public List<Employee> fetchEmployeeRecords();
	
	public Employee viewEmployee(String email);
	
	public Employee viewEmployeeAddress(String address);
	
}
