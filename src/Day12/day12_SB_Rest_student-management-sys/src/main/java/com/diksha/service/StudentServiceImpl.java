package com.diksha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.diksha.dto.StudentDTO;
import com.diksha.entity.Student;
import com.diksha.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepo studentRepo;

	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	public Student mapToEntity(StudentDTO sdto) {
		Student stu = new Student();

		stu.setSname(sdto.getSname());
		stu.setEmail(sdto.getEmail());
		stu.setMobileNumber(sdto.getMobileNum());
		stu.setDeleted(false);

		return stu;
	}

	public StudentDTO mapToDto(Student saveEnt) {

		StudentDTO dto = new StudentDTO();
	
		dto.setSname(saveEnt.getSname());
		dto.setEmail(saveEnt.getEmail());
		dto.setMobileNumber(saveEnt.getMobileNum());
		return dto;
	}

	@Override
	public StudentDTO saveStudent(StudentDTO sdto) {
		// TODO Auto-generated method stub
		Student stu = mapToEntity(sdto);

		Student saveEnt = studentRepo.save(stu);

		StudentDTO dto = mapToDto(saveEnt);
		return dto;
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

		Optional<Student> stu = studentRepo.viewActiveStudent(sno);
		Student st = null;
		if (stu.isPresent()) {
			st = stu.get();
			st.setDeleted(true);
			studentRepo.save(st);
		}
	}
}