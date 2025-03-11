package ChainOfResponsability;
import org.example.ChainOfResponsibility.AvailabilityHandler;
import org.example.ChainOfResponsibility.ConfirmationHandler;
import org.example.ChainOfResponsibility.PaymentHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class RequestTest {
    AvailabilityHandler availabilityHandler;
    ConfirmationHandler confirmationHandler;
    PaymentHandler paymentHandler;

    @BeforeEach
    void setUp(){
        paymentHandler = new PaymentHandler(null);
        confirmationHandler = new ConfirmationHandler(paymentHandler);
        availabilityHandler = new AvailabilityHandler(confirmationHandler);
    }

    @Test
    void deveRetornarVerificandoDisponibilidade(){
        assertEquals("Verificando disponibilidade de ingresso...", availabilityHandler.processReservation("Check Availability"));
    }
    @Test
    void deveRetornarConfirmandoReserva(){
        assertEquals("Confirmando a reserva...", confirmationHandler.processReservation("Confirm Reservation"));
    }
    @Test
    void deveRetornarProcessandoPagamento(){
        assertEquals("Processando pagamento...", paymentHandler.processReservation("Payment"));
    }
    @Test
    void deveRetornarInvalid1(){
        assertEquals("Invalid Request", availabilityHandler.processReservation("teste"));
    }
    @Test
    void deveRetornarInvalid2(){
        assertEquals("Invalid Request", confirmationHandler.processReservation("teste"));
    }
    @Test
    void deveRetornarInvalid3(){
        assertEquals("Invalid Request", paymentHandler.processReservation("teste"));
    }

}
