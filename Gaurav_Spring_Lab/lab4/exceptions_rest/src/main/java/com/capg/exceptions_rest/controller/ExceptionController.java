package com.capg.exceptions_rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.exceptions_rest.exception.InvalidEmployeeIdException;
import com.capg.exceptions_rest.exception.InvalidEmployeeNameException;

@RestController
public class ExceptionController {
	
	@GetMapping(path="/doValidation", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> index(@RequestParam("id") int id,
			@RequestParam("name") String name) throws InvalidEmployeeIdException, InvalidEmployeeNameException
	{
		String strValidProduct = new String();
		
		if(id<=0)
			throw new InvalidEmployeeIdException("(Garv-Rest-Exception) OOPS !! Exception occured : Invalid EmpID is entered,Try Again ");
		else
			strValidProduct = name + " Your authentication is successfull You are a valid Employee (Garv-Rest-Exception)";
		System.out.println("Name is : "+name);
		if(name.equals(""))
			throw new InvalidEmployeeNameException("(Garv-Rest-Exception) OOPS !! Exception occured : Invalid EmpID is entered,Try Again ");
		return new ResponseEntity<String> (strValidProduct, HttpStatus.OK);
	}
}
