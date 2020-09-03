package com.training.vodaphone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounting")
public class AccountingRest {

    @Value("${server.port}")
    private String port;


    @PostMapping("/pay")
    public String pay(final PaymentInfo pi) {
        return "OK " + this.port;
    }

}
