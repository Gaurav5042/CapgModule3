package com.capg.exceptions_rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capg.exceptions_rest.exception.InvalidEmployeeIdException;
import com.capg.exceptions_rest.exception.InvalidEmployeeNameException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({InvalidEmployeeIdException.class, InvalidEmployeeNameException.class})
	public ResponseEntity<String> handleExceptions(Exception ex){
		if(ex instanceof InvalidEmployeeIdException) {
			HttpStatus status = HttpStatus.NOT_FOUND;
			return new ResponseEntity("(Garv-Rest-Exception)OOPS !! Exception occured : Invalid EmpID is entered, Try Again ",status);
		}
		else if(ex instanceof InvalidEmployeeNameException){
			HttpStatus status = HttpStatus.NOT_FOUND;
			return new ResponseEntity("(Garv-Rest-Exception)OOPS !! Exception occured : Invalid EmpName is entered, Try Again ",status);
		}
		else
			return null;
	}
}
