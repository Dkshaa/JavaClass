package com.diksha.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.diksha.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	List<Student> findByIsDeletedFalse();
	
	@Query("from Student where isDeleted= false And sno=:sno")
	public Optional<Student> viewActiveStudent(@Param("sno") int id);

}
