package com.diksha.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.diksha.dto.StudentDto;
import com.diksha.entity.Student;
import com.diksha.repo.StudentRepo;
import com.diksha.service.StudentService;

@Service
public class StudentserviceImpl implements StudentService {
	
	//instead of using auto wired we are using constructor injection
	private StudentRepo studentRepo;
	
	//constructor injection
	public StudentserviceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public StudentDto saveStudent(StudentDto dto) {
		// TODO Auto-generated method stub
		
		//creating entity class object and storing the data dto  to entity class
		Student stu = new Student();
		stu.setSname(dto.getSname());
		stu.setEmail(dto.getEmail());
		stu.setMobileNum(dto.getMobileNum());
		stu.setDeleted(false);
		
		Student saveEnt = studentRepo.save(stu);
		
		
		//Making object of StudentDto and storing it to database
		StudentDto sdto = new StudentDto();
		sdto.setSname(saveEnt.getSname());
		sdto.setEmail(saveEnt.getEmail());
		sdto.setMobileNum(saveEnt.getMobileNum());
		
		return sdto;
	}

	

	

	@Override
	public List<Student> fetchActiveStudentRecords() {
		// TODO Auto-generated method stub
		return studentRepo.findByIsDeletedFalse();
	}

	@Override
	public Student fetchActiveStudent(int sno) {
		// TODO Auto-generated method stub
		return studentRepo.viewActiveStudent(sno).get();
	}

	@Override
	public void deleteStudent(int sno) {
		// TODO Auto-generated method stub

		Optional<Student> stu= studentRepo.viewActiveStudent(sno);
		Student st =null;
		if(stu.isPresent()) {
			st=stu.get();
			st.setDeleted(true);
			studentRepo.save(st);
		}
	}

}
