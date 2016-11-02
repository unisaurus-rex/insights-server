package com.vantiv.insights.model.Greeting;


public class GreetingGetResponse {
    private final String content;

    public GreetingGetResponse() {
        this.content = "Hello there!";
    }

    public String getContent () {
        return this.content;
    }
}
