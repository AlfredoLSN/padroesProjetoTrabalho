package Strategy;
import org.example.Strategy.BankTransferPayment;
import org.example.Strategy.CreditCardPayment;
import org.example.Strategy.PaymentContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PaymentTeste {
    @Test
    void devePagarComCartaoDeCredito(){
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        assertEquals("Pagando com cartao de credito: " + 1200.0, paymentContext.executePayment(1200));
    }
    @Test
    void devePagarComTransferenciaBancaria(){
        BankTransferPayment bankTransferPayment = new BankTransferPayment();
        PaymentContext paymentContext = new PaymentContext(bankTransferPayment);
        assertEquals("Pagando com transferencia bancaria: " + 1200.0, paymentContext.executePayment(1200));
    }
}
