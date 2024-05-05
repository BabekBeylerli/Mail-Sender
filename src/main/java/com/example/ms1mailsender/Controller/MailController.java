package com.example.ms1mailsender.Controller;

import com.example.ms1mailsender.Model.MailStructure;
import com.example.ms1mailsender.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/mail")
public class MailController {
    @Autowired
    private MailService mailService;

    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure) {
        mailService.sendMail(mail, mailStructure);
        return "Successfully sent the Email ";
    }
}
