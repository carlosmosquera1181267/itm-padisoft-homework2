package co.itm.edu.padisoft.homework2;

public interface PaymentProcessor {

    boolean process(Double amount, String currency);
}
