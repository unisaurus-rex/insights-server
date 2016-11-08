package com.vantiv.insights.controller;

import com.vantiv.insights.model.Error.ErrorResponse;
import com.vantiv.insights.model.Error.UndefinedRouteResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class ErrorController extends BaseController{
    /**
     * Handle Undefined Routes
     *
     * @return
     */
    @RequestMapping(path = "/**")
    public ResponseEntity<UndefinedRouteResponse> undefinedRequest() {
        UndefinedRouteResponse undefinedRoute = new UndefinedRouteResponse();


        return new ResponseEntity<UndefinedRouteResponse>(undefinedRoute, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    /**
     * Cudstom handler for /error
     */
    public ResponseEntity<ErrorResponse>genericErrorRequest() {
        return new ResponseEntity<ErrorResponse>(new ErrorResponse(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
