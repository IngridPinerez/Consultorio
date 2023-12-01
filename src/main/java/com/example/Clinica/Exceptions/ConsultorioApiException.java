package com.example.Clinica.Exceptions;
import org.springframework.http.HttpStatusCode;

public class ConsultorioApiException extends RuntimeException{

    private HttpStatusCode code;

    public ConsultorioApiException(String message) {
        super(message);
    }

    public ConsultorioApiException(String message, HttpStatusCode code) {
        super(message);
        this.code = code;
    }

    public ConsultorioApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConsultorioApiException(String message, Throwable cause, HttpStatusCode code) {
        super(message, cause);
        this.code = code;
    }

    public HttpStatusCode getCode() {
        return code;
    }

}
