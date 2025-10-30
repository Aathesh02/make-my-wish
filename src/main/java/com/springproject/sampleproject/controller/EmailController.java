package com.springproject.sampleproject.controller;

import com.springproject.sampleproject.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendEmail(@RequestParam String emailTo, @RequestParam String subject, @RequestParam String body) {
        System.out.println("Send Email");
        emailService.sendSimpleMail(emailTo, subject, body);

        return "Email sent successfully to " + emailTo;
    }
}
