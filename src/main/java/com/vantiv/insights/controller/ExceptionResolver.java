package com.vantiv.insights.controller;

import com.vantiv.insights.model.Error.ErrorResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;


@ControllerAdvice
public class ExceptionResolver extends ResponseEntityExceptionHandler {
    /**
     * handleHttpMessageNotReadable
     * </p>
     * Handles exceptions caused by improperly formatted requests from the client.
     * Currently does not have ability to get specifics on how the request was improperly
     * formatted as this would leak information about the internals of the application.
     * TODO - At some point will want ability to return specifcs to the client.
     *
     * @param ex      the HttpMessageNotReadableException exception object
     * @param headers the HttpHeaders
     * @param status  the HttpStatus
     * @param request the request
     * @return errorResponse
     */
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse("Client Exception", "Invalid request syntax or semantics.");
        ex.printStackTrace();
        return handleExceptionInternal(ex, errorResponse, headers, status, request);
    }


    /**
     *
     * @param ex
     * @param headers
     * @param status
     * @param request
     * @return
     */
    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse("Client Exception", "HTTP method not allowed.");
        ex.printStackTrace();
        return handleExceptionInternal(ex, errorResponse, headers, status, request);
    }

    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse("Client Exception", "Not Found.");
        ex.printStackTrace();
        return handleExceptionInternal(ex, errorResponse, headers, status, request);
    }
}