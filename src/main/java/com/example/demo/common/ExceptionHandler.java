package com.example.demo.common;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDTO> handleArgumentValidException(MethodArgumentNotValidException exception, WebRequest webRequest) {
        return new ResponseEntity<>(
                ExceptionDTO.builder()
                        .code(400)
                        .timeStamp(LocalDateTime.now())
                        .message(exception.getMessage())
                        .build(), HttpStatus.BAD_REQUEST
        );
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionDTO> handleArgumentValidException(IllegalArgumentException exception, WebRequest webRequest) {
        return new ResponseEntity<>(
                ExceptionDTO.builder()
                        .code(400)
                        .timeStamp(LocalDateTime.now())
                        .message(exception.getMessage())
                        .build(), HttpStatus.BAD_REQUEST
        );
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(InvalidFormatException.class)
    public ResponseEntity<ExceptionDTO> handleAInvalidFormatException(InvalidFormatException exception, WebRequest webRequest) {
        return new ResponseEntity<>(
                ExceptionDTO.builder()
                        .code(400)
                        .timeStamp(LocalDateTime.now())
                        .message(exception.getMessage())
                        .build(), HttpStatus.BAD_REQUEST
        );
    }
}
