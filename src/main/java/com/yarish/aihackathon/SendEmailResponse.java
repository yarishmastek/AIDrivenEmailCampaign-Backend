package com.yarish.aihackathon;

public class SendEmailResponse {

    private String message;

    // Constructor
    public SendEmailResponse(String message) {
        this.message = message;
    }

    // Getter
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}