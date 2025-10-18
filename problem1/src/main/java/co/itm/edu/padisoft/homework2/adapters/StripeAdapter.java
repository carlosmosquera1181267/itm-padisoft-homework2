package co.itm.edu.padisoft.homework2.adapters;

import co.itm.edu.padisoft.homework2.PaymentProcessor;
import co.itm.edu.padisoft.homework2.apis.StripeAPI;

public class StripeAdapter implements PaymentProcessor {

    private StripeAPI api;

    @Override
    public boolean process(Double amount, String currency) {
        api = new StripeAPI(amount, currency);
        if (api.processPayment().isBlank()) {
            return false;
        } else {
            return true;
        }
    }
}
