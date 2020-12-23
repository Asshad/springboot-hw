package com.example.helloboost;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonFormat;

@RestController
public class GreetingController {

	private static final String template = "Hello %s!";
	private Date today;
	

	@GetMapping("/hello")
	 
	public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name){
	return new Greeting(new Date(), String.format(template, name));
	}

}

