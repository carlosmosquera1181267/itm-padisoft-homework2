package co.itm.edu.padisoft.homework2.adapters;

import co.itm.edu.padisoft.homework2.PaymentProcessor;
import co.itm.edu.padisoft.homework2.apis.MercadoPagoAPI;

public class MercadoPagoAdapter implements PaymentProcessor {

    private MercadoPagoAPI api;

    @Override
    public boolean process(Double amount, String currency) {
        api = new MercadoPagoAPI(currency, amount);
        return api.pay();
    }
}
