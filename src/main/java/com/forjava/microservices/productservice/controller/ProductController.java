package com.forjava.microservices.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forjava.microservices.productservice.entity.Product;
import com.forjava.microservices.productservice.service.ProductService;

@RestController
@RequestMapping("/api/products/")
public class ProductController
{
	@Autowired
	private ProductService productService;
	
	@GetMapping("/message/")
	public String getMessage()
	{
		return "This is a test message.";
	}
	
	@PostMapping("/")
	public ResponseEntity<Product> saveProduct(Product product)
	{
		//return new ResponseEntity<Product>
		
		
		Product savedProduct = productService.saveProduct(product);
		//return savedProduct;				
	}
	
	@GetMapping("/")
	public List<Product> retrieveAllProducts()
	{
		List<Product> listOfAllProducts = productService.getAllProducts();
		return listOfAllProducts;		
	}
	
	public ResponseBody<Product> retrieveProductById(long productId)
	{
		
	}
	
	
	 
	
}
