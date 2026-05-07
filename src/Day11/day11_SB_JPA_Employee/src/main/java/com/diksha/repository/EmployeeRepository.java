package com.diksha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diksha.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
	
	//findByxxx() Methods
	
	Optional<Employee>findByEname(String email);
	
	Optional<Employee> findByAddress(String address );

}
