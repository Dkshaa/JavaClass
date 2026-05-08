package com.diksha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello";
	}
	
	@GetMapping("/greet/{name}")
	public String greetByName(@PathVariable String name) {
		return "Hello "+ name;
	}
	
	@GetMapping("/leave")
	public String timeToLeave(@RequestParam("name") String name)
	{
		return "Bye " + name;
	}

}
