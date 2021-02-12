package com.example.simple_webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@RestController
public class SimpleController{
	
	@GetMapping(value="/",produces="text/html")
	public String welcome(){
		
		String ipAddress = "IP address can't be obtained"
		
		try{
		  InetAddress inetAddress = InetAddress.getLocalHost();
		  ipAddress = inetAddress.getHostAddress();
		catch(UnknownHostException e){
			 e.printStackTrace();
		 }

		return ipAddress;
	}
}