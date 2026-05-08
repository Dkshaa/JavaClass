package com.diksha.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diksha.dto.StudentDto;
import com.diksha.entity.Student;
import com.diksha.service.impl.StudentserviceImpl;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private StudentserviceImpl serviceImpl;

	//constructor injection
	public StudentController(StudentserviceImpl serviceImpl) {
		super();
		this.serviceImpl = serviceImpl;
	}
	
	//first save
	@PostMapping("/create")
	public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto dto)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(serviceImpl.saveStudent(dto));
	}
	
	@GetMapping("/get")
	public List <Student> viewAllRecords() {
		return serviceImpl.fetchActiveStudentRecords();
	}
	
	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<?> softDelete(@PathVariable int sid) {
		 serviceImpl.deleteStudent(sid);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Student deleted successfully") ;
	}
	
	
	
	

}
