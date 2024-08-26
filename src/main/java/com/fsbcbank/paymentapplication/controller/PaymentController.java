package com.fsbcbank.paymentapplication.controller;
import com.fsbcbank.paymentapplication.tasks.PaymentTask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final PaymentTask paymentTask;

    public PaymentController(PaymentTask paymentTask) {
        this.paymentTask = paymentTask;
    }

    @GetMapping("/payment")
    public String paymentAction() {
        paymentTask.paymentAction();
        return "payment processing started.";
    }
}
