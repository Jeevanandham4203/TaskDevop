package com.TaskDevop.Entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.TaskDevop.Exception.AgeValidationException;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(AgeValidationException.class)
	public ResponseEntity<Object> agevalid(AgeValidationException age){
		return new ResponseEntity<>(age.getMessage(),HttpStatus.NOT_FOUND);
	}
}
