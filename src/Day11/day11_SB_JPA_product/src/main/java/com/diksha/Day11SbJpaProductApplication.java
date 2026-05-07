package com.diksha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diksha.entity.Product;
import com.diksha.service.ProductServiceImpl;

@SpringBootApplication

public class Day11SbJpaProductApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day11SbJpaProductApplication.class, args);
	}
	@Autowired
	private ProductServiceImpl productImpl;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Product p =new Product();
//		p.setFirstName("Washing MAchine");
//		p.setLastName("Nike");
//		p.setEmail("wms@gmail.com");
//		p.setDeleted(false);
//		Product prd=productImpl.saveProduct(p);
//		if(prd!=null) {
//			System.out.println("Record inserted successfully");
//			} else {
//				 System.out.println("Record not inserted successfully");
//			}
		
		//For delete
		
		productImpl.deleteProduct(1);
		productImpl.viewProducts().forEach(p->System.out.println(p.getFirstName()+"\t"+p.getLastName()+"\t"+p.getEmail()));
	}
	

}
