package com.vantiv.insights.controller;

import com.vantiv.insights.model.BS.BS;
import com.vantiv.insights.model.BS.BSDAO;
import com.vantiv.insights.model.Greeting.GreetingGetResponse;
import com.vantiv.insights.model.Greeting.GreetingPostRequest;
import com.vantiv.insights.model.Greeting.GreetingPostResponse;
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

    @Autowired
    private BSDAO bsdao;

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
            BS bs = bsdao.getBS(1000);
            System.out.println(bs.getId() + " *********** " + bs.getDescription() );

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

        return headers;
    }
}
