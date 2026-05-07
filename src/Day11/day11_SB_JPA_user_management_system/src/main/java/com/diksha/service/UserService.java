package com.diksha.service;

import org.springframework.data.domain.Page;

import com.diksha.entity.User;


public interface UserService {
	
	
	public User saveUser(User u);
	
	Page<User> showActiveUsers(int page,int size);
	
	void softDelete(int id);
	

}
