package com.diksha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;

import com.diksha.entity.User;
import com.diksha.service.UserServiceImpl;

@SpringBootApplication
public class Application implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	private UserServiceImpl serviceImpl;
	
	public void run(String... args) throws Exception {
		User u = new User();
		u.setUname("diksha");
		u.setUcourse("java");
		u.setUemail("dk@gmail.com");
		u.setDeleted(false);
		
		User usr = serviceImpl.saveUser(u);
		// pagination
        Page<User> users = serviceImpl.showActiveUsers(0, 2);

        System.out.println("Active Users:");

        users.forEach(user -> {
            System.out.println(user.getUid() + " "
                    + user.getUname() + " "
                    + user.getUemail());
        });
        
        // soft delete
//        serviceImpl.softDelete(1);
//
//        System.out.println("User soft deleted");
    }
		
}
	
	
	

