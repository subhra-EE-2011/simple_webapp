package com.example.simple_webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController{
	
	@GetMapping(value="/",produces="text/plain")
	public String welcome(){
		return "Welcome to simple webapp";
	}
}