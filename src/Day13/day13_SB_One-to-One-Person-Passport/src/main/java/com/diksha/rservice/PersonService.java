package com.diksha.rservice;

import com.diksha.entity.Person;

public interface PersonService {

	public Person savePerson(Person p);
	
	public Person getPerson(int id);
}
