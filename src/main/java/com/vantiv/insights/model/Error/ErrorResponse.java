package com.vantiv.insights.model.Error;

/**
 *
 */
public class ErrorResponse {
    private String message;
    private String error;

    public ErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
    }

    public ErrorResponse() {
        this.error = null;
        this.message = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
