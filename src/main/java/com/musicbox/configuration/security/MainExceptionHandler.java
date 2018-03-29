package com.musicbox.configuration.security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class MainExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(){
        return new ResponseEntity<>("Service temporary unavailable", HttpStatus.SERVICE_UNAVAILABLE);
    }
}
