package com.jobsite.oragejobsite.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail() {
        try {
            String to = "shreyans.jain@oragetechnologies.com";
            String subject = "Hello, Zoho Mail!";
            String body = "This is a test email sent from Spring Boot using Zoho Mail.";

            emailService.sendEmail(to, subject, body);

            return "Email sent successfully!";
        } catch (Exception e) {
            return "Failed to send email: " + e.getMessage();
        }
    }
}
