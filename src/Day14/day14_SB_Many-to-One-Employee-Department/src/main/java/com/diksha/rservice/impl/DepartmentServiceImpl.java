package com.diksha.rservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.diksha.entity.Department;
import com.diksha.entity.Employee;
import com.diksha.repo.DepartmentRepo;
import com.diksha.rservice.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepo departRepo;
	
	@Override
	public Department saveDepartment(Department depart) {
		// TODO Auto-generated method stub
		//set department of each employee
		List<Employee> employees =depart.getEmployees();
		for(Employee emp : employees) {
			emp.setDepartment(depart);
		}
		return departRepo.save(emp);
	}

//	@Override
//	public Employee getPerson(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
