package com.yarish.aihackathon;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class SendEmailRequest {

    @Email(message = "Recipient must be a valid email address")
    @NotBlank(message = "Recipient is required")
    private String recipient;

    @NotBlank(message = "Subject cannot be blank")
    private String subject;

    @NotBlank(message = "Content cannot be blank")
    private String content;

    // Getters and Setters
    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}