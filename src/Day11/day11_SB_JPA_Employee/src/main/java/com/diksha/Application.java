package com.diksha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diksha.entity.Employee;
import com.diksha.service.EmployeeSeviceImpl;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	private EmployeeSeviceImpl employeeService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Employee e = new Employee();
//		e.seteName("fshf");
//		e.seteAdd("brt");
//		Employee saveEmployee = employeeService.saveEmployee(e);
//		if(saveEmployee!= null) {
//			System.out.println("Stored!");
//		}else {
//			System.out.println("NOT Stored!");
//		}
		Employee e = employeeService.viewEmployee("pk@gmail.com");
		
		if(e!=null) {
			System.out.println(e.geteName()+"\t"+e.geteAdd());
		}else {
			System.out.println("Record NOT Found! ");
		}
	}

}
