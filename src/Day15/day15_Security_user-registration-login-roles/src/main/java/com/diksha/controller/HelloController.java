package com.diksha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

	@GetMapping("public")
	public String getHello() {
		return "I'm a public user";
	}
	@GetMapping("normal")
	public String getHello1() {
		return "I'm a normal user";
	}
	@GetMapping("admin")
	public String getHello3() {
		return "I'm a admin user";
	}
}
