package com.vantiv.insights.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class DefaultController {
    @RequestMapping(path="/**")
    public String undefinedRequest() {
        return "ERROR: You have reached an undefined route.";
    }
}
