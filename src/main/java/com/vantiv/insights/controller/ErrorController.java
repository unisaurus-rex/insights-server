package com.vantiv.insights.controller;

import com.vantiv.insights.model.Error.ErrorResponse;
import com.vantiv.insights.model.Error.UndefinedRouteResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Custom Error Controller
 */
@RestController
public class ErrorController
        extends BaseController
        implements org.springframework.boot.autoconfigure.web.ErrorController {
//    /**
//     * Handle Undefined Routes
//     *
//     * @return
//     */
//    @RequestMapping(path = "/**")
//    public ResponseEntity<UndefinedRouteResponse> undefinedRequest() {
//        UndefinedRouteResponse undefinedRoute = new UndefinedRouteResponse();
//
//
//        return new ResponseEntity<UndefinedRouteResponse>(undefinedRoute, new HttpHeaders(), HttpStatus.NOT_FOUND);
//    }

    /**
     * Custom handler for /error
     */
    @RequestMapping(path = "/error")
    public ResponseEntity<ErrorResponse> genericErrorRequest() {
        System.err.println();
        return new ResponseEntity<ErrorResponse>(new ErrorResponse("Internal server error.", "An internal server error occured. Blah blah."), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}
