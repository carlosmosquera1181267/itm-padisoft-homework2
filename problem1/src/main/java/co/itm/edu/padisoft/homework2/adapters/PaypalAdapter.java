package co.itm.edu.padisoft.homework2.adapters;

import co.itm.edu.padisoft.homework2.PaymentProcessor;
import co.itm.edu.padisoft.homework2.apis.PaypalAPI;

public class PaypalAdapter implements PaymentProcessor {
    private PaypalAPI api = new PaypalAPI();
    @Override
    public boolean process(Double amount, String currency) {
        api.setAmount(amount);
        api.setCurrency(currency);
        return api.charge();
    }
}
