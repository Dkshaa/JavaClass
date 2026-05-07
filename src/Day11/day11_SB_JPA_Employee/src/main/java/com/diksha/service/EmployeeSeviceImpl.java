package com.diksha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diksha.entity.Employee;
import com.diksha.repository.EmployeeRepository;

@Service
public class EmployeeSeviceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	@Override
	public Employee saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepo.save(e);
	}

	@Override
	public List<Employee> fetchEmployeeRecords() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee viewEmployee(String email) {
		// TODO Auto-generated method stub
		Optional <Employee> byemail= employeeRepo.findByEname(email).get();
		Employee e = null;
		if(byemail.isPresent()) {
			e= byemail.get();
		}
		return e;
		
	}

	@Override
	public Employee viewEmployeeAddress(String address) {
		// TODO Auto-generated method stub
		Optional<Employee> byAddress =employeeRepo.findByAddress(address).get();
		Employee e= null;
		if(byAddress.isPresent()) {
			e= byAddress.get();
		}
		return e;
	}

}
