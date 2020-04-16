package com.exam.controller.advice;

import com.exam.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionControllerAdvice {

    @ExceptionHandler(MyException.class)
    public String toError(MyException e){
        return "500";
    }

    @ExceptionHandler(Exception.class)
    public String toError(Exception e){
        return "500";
    }
}
