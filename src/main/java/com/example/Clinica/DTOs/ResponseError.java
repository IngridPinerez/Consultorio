package com.example.Clinica.DTOs;

public class ResponseError {

    private String message;
    private Integer code;

    public ResponseError(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

}
