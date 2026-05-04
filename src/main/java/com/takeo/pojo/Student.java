package com.takeo.pojo;

import org.springframework.beans.factory.annotation.Required;



public class Student {
	private String sname;
	private String address;
	
	@Required
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Required
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
