package com.example.simple_webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController{
	
	@GetMapping(value="/",produces="text/html")
	public String welcome(){
		return "<html><body><h1 style=/"color:red/">Fuck Off</h1></body></html>";
	}
}