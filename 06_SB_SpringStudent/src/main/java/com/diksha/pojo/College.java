package com.diksha.pojo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component

public class College {
	@Autowired
	
	private Student student;
	
	public void displayInfo() {
		System.out.println("College Started.......");
		student.display();
		}
	}


