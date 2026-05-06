package com.diksha.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diksha.entity.Employee;
import com.diksha.repo.EmployeeRepository;
@Service
public class EmployeeServiceImpl {
	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> viewAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

}