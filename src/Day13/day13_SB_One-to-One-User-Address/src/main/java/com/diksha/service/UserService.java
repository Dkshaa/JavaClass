package com.diksha.service;

import com.diksha.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public User geUser(int id);

}
