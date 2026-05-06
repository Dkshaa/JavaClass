package com.diksha.service;

import java.util.List;

import com.diksha.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee emp);
	
	public List<Employee> viewAllEmployees();
}

