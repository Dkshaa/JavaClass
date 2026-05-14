package com.diksha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.diksha.entity.UserInfo;
import com.diksha.repo.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		UserInfo dbUserInfo = userRepo.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("Username not found"));
		return new CustomerUserDetailsIml(dbUserInfo);
	}

}
