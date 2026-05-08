package com.diksha.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diksha.dto.StudentDTO;
import com.diksha.entity.Student;

import com.diksha.service.StudentServiceImpl;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	private StudentServiceImpl studentSer;

	public StudentController(StudentServiceImpl studentSer) {
		super();
		this.studentSer = studentSer;
	}
	
	//for inserting data
	@PostMapping("/insert")
	public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO sdto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(studentSer.saveStudent(sdto));
	}
	
	//for fetching data
	public List<Student> viewAllRecords()
	{
		return studentSer.fetchActiveStudentRecords();
	}
	 
	
	

}
