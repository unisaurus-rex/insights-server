package com.vantiv.insights.controller;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * BaseController
 * </p>
 * Common Controller methods, all other controllers inherit from BaseController
 */
abstract class BaseController {

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpServletResponse response;

    protected  Map<String, String> getRequestHeaders() {
        Map<String, String> headers = new HashMap<>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            headers.put(key, value);
        }

        return headers;
    }

    protected void setResponseHeaders(Map<String,String> headers) {
        for (Map.Entry header : headers.entrySet()) {
            this.response.setHeader(header.getKey().toString(), header.getValue().toString());
        }
    }

}
