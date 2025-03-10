package org.example.Strategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public String pay(double amount) {
        return "Pagando com cartao de credito: " + amount;
    }
}
