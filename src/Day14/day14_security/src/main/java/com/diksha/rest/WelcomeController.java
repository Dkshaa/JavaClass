package com.diksha.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {
	@GetMapping("/say")
	public String sayHello() {
		return "Welcome to security";
	}

}
