package com.diksha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.diksha.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
