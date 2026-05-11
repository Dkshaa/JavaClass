package com.diksha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diksha.entity.Person;
import com.diksha.impl.PersonServiceImpl;

@RestController
@RequestMapping("/api/person")
public class PersonController {
	@Autowired
	private PersonServiceImpl serviceImpl;
	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person)
	{
		return serviceImpl.savePerson(person);
	}
	@GetMapping("/get/{id}")
	public Person getPerson(@PathVariable int id) {
		return serviceImpl.getPerson(id);
	}

}
