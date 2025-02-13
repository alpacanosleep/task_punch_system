package com.acm.msgtomail.front.controller;

import com.acm.msgtomail.front.Service.MailService;
import com.acm.msgtomail.front.entity.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MailController {
    @Autowired
    MailService mailService;

//    @ResponseBody
    @PostMapping("/sendsimplemail")
    public String sendMail(Mail mail){
        mailService.sendSimpleMail(mail);
        return "简单邮件发送成功！";
    }

}
