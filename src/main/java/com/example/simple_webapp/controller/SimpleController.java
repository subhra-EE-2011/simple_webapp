package com.example.simple_webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.*;

@RestController
public class SimpleController{
	
	@GetMapping(value="/",produces="text/html")
	public String welcome(){
		
		String hostName = "Hostname can't be obtained" ;
		
		try{
		  InetAddress inetAddress = InetAddress.getLocalHost();
		  hostName = inetAddress.getHostName();
		}catch(UnknownHostException e){
			 e.printStackTrace();
		 }

		return hostName;
	}
}