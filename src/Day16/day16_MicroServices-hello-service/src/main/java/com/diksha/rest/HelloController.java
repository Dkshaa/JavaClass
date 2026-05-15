package com.diksha.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

	
	//http://localhost:2222/api/hello/say/shiva
	@GetMapping("/say/{name}")
	public String sayHello(@PathVariable String name) {
		return "Welcome to  : " + name;
	}
}
