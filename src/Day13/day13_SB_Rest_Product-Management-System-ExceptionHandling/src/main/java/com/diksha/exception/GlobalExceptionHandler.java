package com.diksha.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFound(ResourceNotFoundException ex)
	{
		ErrorResponse response =new ErrorResponse(ex.getMessage(),HttpStatus.NOT_FOUND.value(),LocalDateTime.now());
		
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	
//	@ExceptionHandler(NoResourceFoundException.class)
//	public ResponseEntity<?> handleNoResourceFoundException(NoResourceFoundException ex)
//	{
//		ErrorResponse response = new ErrorResponse(ex.getMessage(),HttpStatus.NOT_FOUND.value(),LocalDateTime.now());
//		
//		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
//	}

}
