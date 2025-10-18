package co.itm.edu.padisoft.homework2.apis;

import java.util.UUID;

public class StripeAPI {
    private Double amount;
    private String currency;
    private String id;
    public StripeAPI(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public String processPayment() {
        this.id = UUID.randomUUID().toString();
        System.out.println("Pagando con STRIPE");
        System.out.println(String.format("Monto: %s", this.amount));
        System.out.println(String.format("Moneda: %s", this.currency));
        return this.id;
    }
}
