package com.diksha.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/api/hi")
public class HiController {
@Autowired
	RestTemplate restTemplate;
	//http://localhost:1111/api/hi/bye/rani
	@GetMapping("/bye/{name}")
	public String sayHi(@PathVariable String name)
	{
	//	RestTemplate rs=new RestTemplate();
		
		String message = restTemplate.getForObject("http://localhost:2222/api/hello/say/"+name, String.class);
		
		return "Good Morning  : "+ message;
	}
}
