package com.diksha.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diksha.entity.Person;
import com.diksha.repo.PersonRepo;
import com.diksha.rservice.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepo personRepo;
	@Override
	public Person savePerson(Person p) {
		// TODO Auto-generated method stub
		return personRepo.save(p);
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return personRepo.findById(id).orElse(null);
	}

}
