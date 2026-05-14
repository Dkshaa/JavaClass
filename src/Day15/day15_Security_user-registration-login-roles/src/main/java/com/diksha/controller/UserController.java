package com.diksha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diksha.config.JWTService;
import com.diksha.dto.AuthRequestDto;
import com.diksha.dto.AuthResponseDto;
import com.diksha.dto.UserRequest;
import com.diksha.dto.UserResponse;
import com.diksha.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private JWTService jwtService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	public UserResponse saveUser(UserRequest userRequest)
	{
		return userService.createUser(userRequest);
	}
	
	//login
	
	@PostMapping("/login")
	public AuthResponseDto authenticationNameAndPasswordLogin(@RequestBody AuthRequestDto requestDto)
	{
		var authentication =authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(requestDto.getUsername(),requestDto.getPassword()));
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		if(authentication.isAuthenticated())
		{
			AuthResponseDto authDto =new AuthResponseDto();
					authDto.setAccessToken(jwtService.generateToken(requestDto.getUsername()));
					return authDto;
					
		}else
			throw new UsernameNotFoundException("Invalid Request");
		
	}
}
