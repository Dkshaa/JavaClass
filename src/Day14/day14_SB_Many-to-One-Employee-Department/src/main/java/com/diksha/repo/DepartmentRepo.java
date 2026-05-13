package com.diksha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.diksha.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
