package com.diksha.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.diksha.dto.UserRequest;
import com.diksha.dto.UserResponse;
import com.diksha.entity.UserInfo;
import com.diksha.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	//just like DTo its next ModelMapper
	//it converts Dto to entity and entity to Dto 
	private ModelMapper modelMapper = new ModelMapper();
	
	public UserResponse createUser(UserRequest userRequest)
	{
		//convert dto to entity
		UserInfo userInfo = modelMapper.map(userRequest, UserInfo.class);
		
		//Before saving it to db,convert password into encoded pw
		userInfo.setPassword(passwordEncoder.encode(userRequest.getPassword()));
		
		//save to databse and convert entity to dto
		
		return modelMapper.map(userRepo.save(userInfo), UserResponse.class);
	}

}
