package com.yarish.aihackathon;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/email-customize")
@Validated
public class EmailCustomizeController {

    @Autowired
    private EmailCustomizeService emailCustomizeService;

    @PostMapping
    public ResponseEntity<EmailCustomizeResponse> customizeEmail(
            @Valid @RequestBody EmailCustomizeRequest request) {

        String customizedEmail = emailCustomizeService.customizeEmail(request.getEmailContent(), request.getPrompt());
        return ResponseEntity.ok(new EmailCustomizeResponse(customizedEmail));
    }
}