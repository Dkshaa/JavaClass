package com.diksha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diksha.service.CustomerServiceImpl;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	CustomerServiceImpl serviceImpl;
	@Override
	public void run(String... args) throws Exception {
		
		//For adding records

//		Customer c = new Customer();
//		c.setCname("lasta");
//		c.setCemail("rikes@gmail.com");
//		c.setDeleted(false);
//		Customer cust = serviceImpl.saveCustomer(c);
//		if(cust!=null) {
//			System.out.println("Record added successfully!");
//		}else {
//			System.out.println("Record not added successfully!");
//		}
		
		//for deleting records
			//serviceImpl.deleteCustomer(1);
		
		//for viewing records
		serviceImpl.viewCustomers().forEach(c->System.out.println(c.getCid()+"\n"+c.getCname()+"\n"+c.getCemail()+"\n"+c.isDeleted()));
		
		
		//for pagination
		serviceImpl.getCustomers(0,5).forEach(c->System.out.println(c.getCid()+"\n"+c.getCname()+"\n"+c.getCemail()+"\n"+c.isDeleted()));
	}
	
}
