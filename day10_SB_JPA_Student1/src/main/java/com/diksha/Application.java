package com.diksha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diksha.entity.Student;
import com.diksha.service.StudentServiceImpl;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	private StudentServiceImpl studentService;
	
	@Override
	public void run(String... args) throws Exception{
		Student s =new Student();
		s.setId(1);
		s.setName("pk");
		s.setEmail("pk@gmail.com");
		Student saveStudent = studentService.saveStudent(s);
		if(saveStudent!= null)
			System.out.println("Record stored in db");
		else
			System.out.println("Record not stored in db");
	}

}
