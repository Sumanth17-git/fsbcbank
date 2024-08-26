package com.fsbcbank.paymentapplication.tasks;

import org.springframework.stereotype.Component;

import com.fsbcbank.paymentapplication.services.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentTask {

    private final PaymentService paymentService;

    public PaymentTask(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void paymentAction() {
        new Thread(paymentService::processpayment).start();
    }
}
