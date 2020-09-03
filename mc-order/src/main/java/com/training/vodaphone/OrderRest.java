package com.training.vodaphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderRest {

    @Autowired
    private RestTemplate rt;

    @PostMapping("/place")
    public String place(final OrderInfo oi) {
        PaymentInfo paymentInfoLoc = new PaymentInfo();
        paymentInfoLoc.setCustomerId(oi.getCustomerId());
        paymentInfoLoc.setAmount(100);
        String postForObjectLoc = this.rt.postForObject("http://ACCOUNT/accounting/pay",
                                                        paymentInfoLoc,
                                                        String.class);
        return postForObjectLoc;
    }

}
