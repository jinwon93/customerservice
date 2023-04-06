package com.example.customerservice.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public class ApiCommonException extends RuntimeException{


    private static final long serialVersionUID = 1L;

    private final HttpStatus httpStatus;
    private final String messageCode;
    private final String messageDetail;

    public ApiCommonException(HttpStatus status, String messageCode, String messageDetail) {
        this.httpStatus = status;
        this.messageCode = messageCode;
        this.messageDetail = messageDetail;
    }


    public ApiCommonException(ApiCommonException message) {
        this.httpStatus = message.getHttpStatus();
        this.messageCode = message.getMessageCode();
        this.messageDetail = message.getMessageDetail();
    }
}
