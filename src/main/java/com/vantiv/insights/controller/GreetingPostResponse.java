package com.vantiv.insights.controller;


public class GreetingPostResponse {
    private final String content;

    public GreetingPostResponse(String name) {
        this.content = String.format("Hello %s", name);
    }

    public GreetingPostResponse() {
        this.content = "What's your name?";
    }


    public String getContent () {
        return this.content;
    }
}
