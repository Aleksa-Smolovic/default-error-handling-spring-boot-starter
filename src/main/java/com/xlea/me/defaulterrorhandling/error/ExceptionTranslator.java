package com.xlea.me.defaulterrorhandling.error;

import com.xlea.me.defaulterrorhandling.dto.ErrorResponse;
import com.xlea.me.defaulterrorhandling.exception.BadActionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionTranslator extends ResponseEntityExceptionHandler {

    Logger log = LoggerFactory.getLogger(ExceptionTranslator.class);

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleGenericException(Exception exception, NativeWebRequest request) {
        log.error("Exception {}", (Object) exception);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleBadActionException(BadActionException exception, NativeWebRequest request) {
        log.error("Exception {}", (Object) exception);
        HttpStatus httpStatus = HttpStatus.resolve(exception.getStatus());
        if (httpStatus == null)
            httpStatus = HttpStatus.BAD_REQUEST;
        return ResponseEntity
                .status(httpStatus)
                .body(new ErrorResponse(exception.getCode(), exception.getDescription(), exception.getStatus()));
    }

    // TODO unauthorized exception
}
