package com.diksha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diksha.entity.Student;
import com.diksha.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student saveStudent(Student stu) {
		// TODO Auto-generated method stub
		return studentRepo.save(stu);
	}

	@Override
	public List<Student> fetchStudentRecords() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student fetchStudentInfo(int id) {
		// TODO Auto-generated method stub
		 Optional<Student> byId =studentRepo.findById(id);
		 Student s= null;
		if(byId.isPresent())
		{
			s=byId.get();
		}
		 return s;
	}

}
