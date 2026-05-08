package com.diksha.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcommeController {
	
	@GetMapping("/say")
	public String sayHello() 
	{
		return "hello to App Demo";
	}
	
	
	//http://8080/welcome/diksha---->along with url if we pass parameter
	//path parameter can be captured using @PathVariable
	@GetMapping("/welcome/{name}")
	public String sayMorning(@PathVariable String name) {
		
		return "Welcome: "+ name;
	}
	
	//http://8080/bye?name=diksha---->along with url if we pass parameter,it is called query paramater
	//query parameter can be captured using @RequestParam
	@GetMapping("/bye")
	public String sayBye(@RequestParam("name") String name) {
		return "Good Night "+ name;
	}
}
