package com.example.helloboost.exceptions.resolvers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestControllerAdvice
public class ExceptionResolver {

    @ExceptionHandler(NoHandlerFoundException.class)
    public HashMap<String, String> handleNotFoundResourceException(HttpServletRequest request, NoHandlerFoundException e) {
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "You are not authorized to access this page");
        return response;
    }
}