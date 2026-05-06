package com.diksha.service;

import java.util.List;
import java.util.Optional;

import com.diksha.entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student stu);
	
	public List<Student> fetchStudentRecords();
	
	public Student fetchStudentInfo(int id);
	
	

}
