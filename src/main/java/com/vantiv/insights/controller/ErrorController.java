package com.vantiv.insights.controller;


import com.vantiv.insights.model.Error.ErrorResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    public ErrorResponse genericErrorRequest() {

        if (this.response.getStatus() == HttpServletResponse.SC_BAD_REQUEST) {    // 400 http status
            // TODO Poorly formatted request, client error

        } else if (this.response.getStatus() == HttpServletResponse.SC_INTERNAL_SERVER_ERROR) {   // 500 http status
            // TODO internal error
        } else if (this.response.getStatus() == HttpServletResponse.SC_UNAUTHORIZED) {    // 401 http status
            // TODO unauthorized
        } else if (this.response.getStatus() == HttpServletResponse.SC_METHOD_NOT_ALLOWED) {
            // TODO method not allowed
        } else {
            // TODO all others

        }
        System.err.println("Http status code :: " + this.response.getStatus());
        return new ErrorResponse("Error", null);
    }

    @Override
    public String getErrorPath() {
        return null;
    }
}