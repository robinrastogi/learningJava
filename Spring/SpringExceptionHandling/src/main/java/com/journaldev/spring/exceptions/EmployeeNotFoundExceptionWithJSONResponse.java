package com.journaldev.spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Employee Not Found") //404
public class EmployeeNotFoundExceptionWithJSONResponse extends Exception {

	private static final long serialVersionUID = 5368465396982765661L;
	

	public EmployeeNotFoundExceptionWithJSONResponse(int id){
		super("EmployeeNotFoundExceptionWithJSONResponse with id="+id);
	}
}
