package com.vantiv.insights.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

//    private String path = "/greeting".CASE_INSENSITIVE_ORDER;

    /**
     * Default/Undefined route Handler. Can be an error or some other message
     *
     * @param s
     */
    @RequestMapping(path = "**")
    public String greeting (String s) {
        return "I am Undefined Currently.";
    }

    /**
     * GET /greeting route
     *
     * @return GreetingGetResponse
     */
    @GetMapping(path = "/greeting")
    public GreetingGetResponse greeting() {
        return new GreetingGetResponse();
    }

    /**
     * POST /greeting
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

}
