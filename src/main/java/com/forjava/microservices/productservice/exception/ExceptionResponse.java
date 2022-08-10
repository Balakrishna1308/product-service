package com.forjava.microservices.productservice.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ExceptionResponse
{
	private String message;
	private String details;
	private Date timeStamp;
}
