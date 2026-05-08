package com.diksha.service;

import java.util.List;

import com.diksha.dto.StudentDto;
import com.diksha.entity.Student;

public interface StudentService {

public StudentDto saveStudent(StudentDto dto); 
	
	public List<Student> fetchActiveStudentRecords();
	
	public Student fetchActiveStudent(int sno);
	
	public void deleteStudent(int sno);
}
