package com.yarish.aihackathon;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/send-email")
@Validated
public class EmailController {

    @Autowired
    private EmailService emailService;

//    @PostMapping("/send-email")
    @PostMapping
    public ResponseEntity<SendEmailResponse> sendEmail(
            @Valid @RequestBody SendEmailRequest request) {

        // Send the email
        emailService.sendEmail(request.getRecipient(), request.getSubject(), request.getContent());

        String message = String.format(
                "Email sent successfully to %s with subject '%s'.",
                request.getRecipient(),
                request.getSubject()
        );

        return ResponseEntity.ok(new SendEmailResponse(message));
    }
}

