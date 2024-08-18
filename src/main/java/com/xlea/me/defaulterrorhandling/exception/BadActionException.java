package com.xlea.me.defaulterrorhandling.exception;


import com.xlea.me.defaulterrorhandling.dto.ExceptionError;
import org.springframework.http.HttpStatus;

public class BadActionException extends RuntimeException {

    private int status = HttpStatus.BAD_REQUEST.value();
    private String code;
    private String description = HttpStatus.BAD_REQUEST.getReasonPhrase();

    public int getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public BadActionException(String code) {
        this.code = code;
    }

    public BadActionException(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public BadActionException(int status, String code, String description) {
        this.status = status;
        this.code = code;
        this.description = description;
    }

    public BadActionException(ExceptionError exceptionError) {
        this(exceptionError.getStatus(), exceptionError.getCode(), exceptionError.getDescription());
    }

}
