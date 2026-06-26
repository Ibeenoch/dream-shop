package com.dailycodework.dreamshops.exceptions;

import org.springframework.expression.AccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(AccessException.class)
    public ResponseEntity<String> handleAccessDenyException(AccessDeniedException ex){
        String message = "You do not have permission to access this resources";
        return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
    }
}
