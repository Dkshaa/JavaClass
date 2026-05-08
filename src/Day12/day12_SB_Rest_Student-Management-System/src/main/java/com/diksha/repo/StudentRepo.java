package com.diksha.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.yaml.snakeyaml.events.Event.ID;

import com.diksha.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
List<Student> findByIsDeletedFalse();
	
	@Query("from Student where isDeleted= false and sno=:sid")
	public Optional<Student> viewActiveStudent(@Param("sid") int sid);


}
