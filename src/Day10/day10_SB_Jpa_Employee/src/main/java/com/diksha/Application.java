package com.diksha;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diksha.entity.Employee;
import com.diksha.entity.MaritalStatus;
import com.diksha.service.EmployeeServiceImpl;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
@Autowired
	private EmployeeServiceImpl serviceImpl;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEname("rani");
		emp.setEadd("Hyderabad");
		emp.setGender(MaritalStatus.MALE);
		emp.setMobileNumber("9985538461");
		emp.setSfee(2500);
		Employee saveEmployee = serviceImpl.saveEmployee(emp);
		if(saveEmployee!=null)
			System.out.println("Record stored into the database");
		else
			System.out.println("Record is not exist");
		
		serviceImpl.viewAllEmployees().forEach(e->System.out.println(e.getEno()+"\t"+e.getEname()+"\t"+e.getEadd()+"\t"+e.getMobileNumber()+"\t"+e.getSfee()));

	}

}