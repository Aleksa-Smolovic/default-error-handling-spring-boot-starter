package com.xlea.me.defaulterrorhandling.dto;

import org.springframework.http.HttpStatus;

public interface ExceptionError {

    default int getStatus() {
        return HttpStatus.BAD_REQUEST.value();
    }

    String getCode();

    String getDescription();

}
