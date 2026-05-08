package com.diksha.service;

import java.util.List;

import com.diksha.dto.StudentDTO;
import com.diksha.entity.Student;

public interface StudentService {

	public StudentDTO saveStudent(StudentDTO dto); 
	
	public List<Student> fetchActiveStudentRecords();
	
	public Student fetchActiveStudent(int sno);
	
	public void deleteStudent(int sno);
}
