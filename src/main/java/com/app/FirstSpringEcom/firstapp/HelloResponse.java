package com.app.FirstSpringEcom.firstapp;

public class HelloResponse {
    // Json Response
    private String message;

    public HelloResponse(String message) {
        this.message = message;
    }
// If you don't have the get then it skipper from the json response of api.
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
