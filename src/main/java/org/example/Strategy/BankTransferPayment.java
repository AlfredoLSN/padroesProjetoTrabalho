package org.example.Strategy;

public class BankTransferPayment implements PaymentStrategy{

    @Override
    public String pay(double amount) {
        return "Pagando com transferencia bancaria: " + amount;
    }
}
