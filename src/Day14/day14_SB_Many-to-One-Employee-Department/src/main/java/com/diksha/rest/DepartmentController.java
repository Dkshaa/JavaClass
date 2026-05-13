package com.diksha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diksha.entity.Employee;
import com.diksha.rservice.impl.DepartmentServiceImpl;

@RestController
@RequestMapping("/api/person")
public class DepartmentController {
	@Autowired
	private DepartmentServiceImpl serviceImpl;
	
	@PostMapping("/save")
	public Employee savePerson(@RequestBody Employee person)
	{
		return serviceImpl.savePerson(person);
	}
	@GetMapping("/get/{id}")
	public Employee getPerson(@PathVariable int id) {
		return serviceImpl.getPerson(id);
	}

}
