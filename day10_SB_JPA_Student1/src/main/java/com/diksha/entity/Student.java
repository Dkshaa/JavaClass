package com.diksha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stu_details")
public class Student {
	
//	Generate ids for 3 columns and GeneratedValues will increase the id by1 by default
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name= "Id")
	private int id;
	
	@Column (name= "Name")
	private String name;
	
	@Column (name= "Email")
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
