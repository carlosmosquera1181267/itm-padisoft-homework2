package co.itm.edu.padisoft.homework2.platform;

import co.itm.edu.padisoft.homework2.PaymentProcessor;

public class ECommercePlatform {

    private PaymentProcessor paymentProcessor;

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(Double amount, String currency) {
        paymentProcessor.process(amount, currency);
    }
}
