package com.diksha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diksha.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
