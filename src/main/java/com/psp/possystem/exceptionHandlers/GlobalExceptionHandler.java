package com.psp.possystem.exceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.psp.possystem.exceptions.*;

// Used so that Swagger can read the annotations and DOCUMENT exceptions of controllers
// Handles all exceptions thrown of type provided in @ExceptionHandler({custom_type1.class, custom_type2.class, ...})
// To create a custom exception go to exceptions package and add your exception by extending an exception class
@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler({NotFoundException.class})
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public NotFoundResponse handleNotFoundException(NotFoundException exception) {
		NotFoundResponse response = new NotFoundResponse();
		response.id = exception.getMessage();
		return response;
	}
}

class NotFoundResponse {
	public String id;
}