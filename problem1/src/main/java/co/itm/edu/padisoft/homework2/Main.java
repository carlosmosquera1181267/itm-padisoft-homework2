package co.itm.edu.padisoft.homework2;

import co.itm.edu.padisoft.homework2.adapters.MercadoPagoAdapter;
import co.itm.edu.padisoft.homework2.platform.ECommercePlatform;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome to this Ecommerse!\r\n");

        ECommercePlatform platform = new ECommercePlatform();

        //PaymentProcessor processor = new PaypalAdapter();
        //PaymentProcessor processor = new StripeAdapter();
        PaymentProcessor processor = new MercadoPagoAdapter();

        platform.setPaymentProcessor(processor);
        platform.checkout(100D, "USD");
    }
}