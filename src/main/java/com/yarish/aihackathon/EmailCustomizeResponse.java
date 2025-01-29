package com.yarish.aihackathon;


public class EmailCustomizeResponse {

    private String emailContent;

    // Constructor
    public EmailCustomizeResponse(String emailContent) {
        this.emailContent = emailContent;
    }

    // Getter
    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }
}
