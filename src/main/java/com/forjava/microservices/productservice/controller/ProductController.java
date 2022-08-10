package com.forjava.microservices.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products/")
public class ProductController
{
	@GetMapping("/message/")
	public String getMessage()
	{
		return "This is a test message.";
	}
	
}
