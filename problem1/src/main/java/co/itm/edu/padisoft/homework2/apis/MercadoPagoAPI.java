package co.itm.edu.padisoft.homework2.apis;

import java.util.UUID;

public class MercadoPagoAPI {
    private String id;
    private String currency;
    private Double amount;

    public MercadoPagoAPI(String currency, Double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public boolean pay() {
        this.id = UUID.randomUUID().toString();
        System.out.println("Pagando con Mercado Pago");
        System.out.println(String.format("Monto: %s", this.amount));
        System.out.println(String.format("Moneda: %s", this.currency));
        System.out.println("Pagado.");
        return true;
    }
}
