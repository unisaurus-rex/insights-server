package com.vantiv.insights.controller;


public class GreetingPostRequest {
    private final String name;

    public GreetingPostRequest(String name) {
        this.name = name;
    }

    public GreetingPostRequest() {
        this.name = null;
    }

    public String getName () {
        return this.name;
    }
}
