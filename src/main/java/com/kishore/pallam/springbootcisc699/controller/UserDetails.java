package com.kishore.pallam.springbootcisc699.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserDetails {
	static Map<String,String> userNames;
	
	static {
		userNames= new HashMap<>();
		
		userNames.put("Martin","Luther");
		userNames.put("Ricky","spencer");
		userNames.put("PallamReddy", "Krishna");
		userNames.put("KK", "Kishore");
	}
	
	@RequestMapping("/getUsers")
	public String getUsers(@RequestParam(value = "name",
			defaultValue = "PallamReddy") String name){
		return "Welcome "+userNames.get(name);
	}

}
