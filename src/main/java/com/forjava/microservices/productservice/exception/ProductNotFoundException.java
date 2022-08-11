package com.forjava.microservices.productservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	
	
	public ProductNotFoundException() 
	{
		super();
	}

	public ProductNotFoundException(long id)
	{
	  super(String.format("Product not found with this id #%d", id));	
	}

	public ProductNotFoundException(String resourceName, String fieldName, Object fieldValue)
	{
		super(String.format("%s not found with %s of %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}		
	
}
