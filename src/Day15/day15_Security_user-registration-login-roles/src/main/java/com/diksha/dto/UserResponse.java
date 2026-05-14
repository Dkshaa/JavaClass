package com.diksha.dto;

import java.util.Set;

import com.diksha.entity.UserRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserResponse {

	private String username;
	
	
	
	
	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public Set<UserRole> getRoles() {
		return roles;
	}




	public void setRoles(Set<UserRole> roles) {
		this.roles = roles;
	}




	private Set<UserRole> roles;
}
