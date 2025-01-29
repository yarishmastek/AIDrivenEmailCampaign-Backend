package com.yarish.aihackathon;

import jakarta.validation.constraints.NotBlank;

public class EmailCustomizeRequest {

    @NotBlank(message = "Email-Content cannot be blank")
    private String emailContent;

    @NotBlank(message = "Prompt cannot be blank")
    private String prompt;

    // Getters and Setters
    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}

