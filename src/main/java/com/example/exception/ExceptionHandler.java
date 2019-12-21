package com.example.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;



@ControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler (ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex) {
		/*List<ApplicationError> applicationErrorList = new ArrayList<>();
		ApplicationErrors applicationErrors = new ApplicationErrors();
		
		ApplicationError applicationError=new ApplicationError();
		applicationError.setCode(HttpStatus.NOT_FOUND.toString());
		applicationError.setMessage(ex.getMessage());
		applicationError.setSeverity(Constant.Severity.ERROR.toString());
		applicationError.setAttribute("");
		applicationError.setTicketId(Constant.EMPTY);
		applicationErrorList.add(applicationError);
		applicationErrors.setErrors(applicationErrorList);
		return new ResponseEntity<ApplicationErrors>(applicationErrors,HttpStatus.NOT_FOUND);*/
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
