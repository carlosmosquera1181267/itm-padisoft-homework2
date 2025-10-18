package co.itm.edu.padisoft.homework2.apis;

public class PaypalAPI {
    Double amount;
    String currency;

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean charge() {
        System.out.println("Pagando con PayPal");
        System.out.println(String.format("Monto: %s", this.amount));
        System.out.println(String.format("Moneda: %s", this.currency));
        return true;
    }
}
