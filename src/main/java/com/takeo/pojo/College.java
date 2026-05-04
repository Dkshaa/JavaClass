package com.takeo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class College {
	private String name;
	
	@Qualifier(value = "st1") //If you have two objects then use qualifier
	@Autowired
	private Student student;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void displayInfo() {
		System.out.println("College name "+name);
		
		System.out.println(student.getSname()+"\t"+student.getAddress());	
		
		
	}

}
