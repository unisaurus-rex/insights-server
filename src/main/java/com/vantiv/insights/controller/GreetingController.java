package com.vantiv.insights.controller;

import com.vantiv.insights.model.GreetingGetResponse;
import com.vantiv.insights.model.GreetingPostRequest;
import com.vantiv.insights.model.GreetingPostResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {
    @Autowired
    private HttpServletRequest request;
//    private String path = "/greeting".CASE_INSENSITIVE_ORDER;

    /**
     * Default/Undefined route Handler. Can be an error or some other message
     *
     * @param s
     */
    @RequestMapping(path = "**")
    public String greeting(String s) {
        return "I am Undefined Currently.";
    }

    /**
     * GET /greeting route
     *
     * @return GreetingGetResponse
     */
    @GetMapping(path = "/greeting")
    public GreetingGetResponse greeting() {
        System.out.println(this.getRequestHeaders());
        return new GreetingGetResponse();
    }

    /**
     * POST /greeting
     *
     * @param greetingPostRequest
     * @return
     */
    @PostMapping(path = "/greeting")
    public GreetingPostResponse greeting(@RequestBody(required = false) GreetingPostRequest greetingPostRequest) {
        if (greetingPostRequest != null) {
            return new GreetingPostResponse(greetingPostRequest.getName());
        }
        return new GreetingPostResponse();
    }

    private Map<String, String> getRequestHeaders() {
        Map<String, String> headers = new HashMap<>();

        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            headers.put(key, value);
        }

        for (Map.Entry<String,String> entry: headers.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return headers;
    }
}
