package com.FirstPackage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class HelloController {
	
	@GetMapping("/message")
	public String displayMessage() {
		return "Welcome to restful web service";
	}

	@GetMapping("/display")
	public String showProduct() {
		return "Shows the Product";
	}


}
