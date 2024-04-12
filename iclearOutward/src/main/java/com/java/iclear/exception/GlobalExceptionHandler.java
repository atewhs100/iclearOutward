package com.java.iclear.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ChequeNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleAllException(Exception ex) {
		ErrorDetails details = new ErrorDetails(ex.getMessage(), new Date());
		ResponseEntity<ErrorDetails> responseEntity = new ResponseEntity<ErrorDetails>(details, HttpStatus.NOT_FOUND);
		return responseEntity;

	}

}
