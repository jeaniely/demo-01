package com.example.first1.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ServiceExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    @ResponseBody
    public Response handle(ServiceException se){
        return ResponseUtils.error(se.getCode(),se.getMessage());
    }

}
