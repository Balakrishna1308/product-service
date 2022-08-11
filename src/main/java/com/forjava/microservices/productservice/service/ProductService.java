package com.forjava.microservices.productservice.service;

import java.util.List;

import com.forjava.microservices.productservice.entity.Product;

public interface ProductService
{
	Product saveProduct(Product product);
	List<Product> getAllProducts();
	Product getProductById(long productId);
	Product updateProductById(Product product, long productId);
	void deleteProductById(long productId);	
}
