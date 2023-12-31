package com.example.Clinica.Exceptions;

import com.example.Clinica.DTOs.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(value = {ConsultorioApiException.class})
    public ResponseEntity<ResponseError> handleConsultorioApiException(ConsultorioApiException e){

        ResponseError res = new ResponseError(e.getMessage(), e.getCode().value());
        return new ResponseEntity<ResponseError>(res, e.getCode());
    }

}
