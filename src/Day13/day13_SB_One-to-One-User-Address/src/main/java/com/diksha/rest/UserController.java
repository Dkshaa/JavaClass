package com.diksha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diksha.entity.User;
import com.diksha.service.UserServiceImpl;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	
	@Autowired
	private UserServiceImpl serviceImpl;
	
	
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user)
	{
		return serviceImpl.saveUser(user);
	}
//	@PostMapping("/save")
//	public User saveUser(@RequestBody User user) {
//	    System.out.println(user.getName());
//	    return serviceImpl.saveUser(user);
//	}
	@GetMapping("/test")
	public String test() {
	    return "User controller working";
	}
	@GetMapping("/get/{id}")
	public User getUser(@PathVariable int id)
	{
		return serviceImpl.geUser(id);
	}
	

}
