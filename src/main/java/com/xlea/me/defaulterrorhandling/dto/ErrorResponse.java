package com.xlea.me.defaulterrorhandling.dto;

import java.time.Instant;

public class ErrorResponse {

    private String code;
    private String message;
    private Integer status;
    private Instant timestamp = Instant.now();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public ErrorResponse(String code, String message, Integer status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }
}
