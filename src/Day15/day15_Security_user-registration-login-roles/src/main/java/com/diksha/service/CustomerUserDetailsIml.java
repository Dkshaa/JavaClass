package com.diksha.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.diksha.entity.UserInfo;
import com.diksha.entity.UserRole;

public class CustomerUserDetailsIml implements UserDetails {

	private String userName;
	private String password;
	
	public Collection<? extends GrantedAuthority> authorities;
	
	public CustomerUserDetailsIml(UserInfo userInfo) 
	{
		this.userName= userInfo.getUsername();
		this.password = userInfo.getPassword();
		List<GrantedAuthority>auths =new ArrayList();
		for(UserRole role:userInfo.getRoles())
		{
			auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
		}
		this.authorities = auths;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}

	@Override
	public @Nullable String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

}
