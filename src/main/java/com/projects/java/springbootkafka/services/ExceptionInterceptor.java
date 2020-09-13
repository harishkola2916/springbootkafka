package com.projects.java.springbootkafka.services;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionInterceptor extends ResponseEntityExceptionHandler {

@ExceptionHandler(ConstraintViolationException.class)
  public final ResponseEntity<Object> handleConstraintViolationExceptions(
      ConstraintViolationException ex) {
    String exceptionResponse = String.format("Invalid input parameters: %s\n", ex.getMessage());
    return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
  }
}
