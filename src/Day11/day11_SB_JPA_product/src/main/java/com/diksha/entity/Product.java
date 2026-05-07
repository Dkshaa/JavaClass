package com.diksha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="prd_details")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private int uid;
	private String firstName;
	private String lastName;
	private String email;
	private int mobNum;
	@Column(name= "isDeleted")
	private boolean isDeleted;
	
	
	//No need to write this with lombok
//	public int getUid() {
//		return uid;
//	}
//	public void setUid(int uid) {
//		this.uid = uid;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public int getMobNum() {
//		return mobNum;
//	}
//	public void setMobNum(int mobNum) {
//		this.mobNum = mobNum;
//	}
//	public boolean isDeleted() {
//		return isDeleted;
//	}
//	public void setDeleted(boolean isDeleted) {
//		this.isDeleted = isDeleted;
//	}
//	
	
	
	

}
