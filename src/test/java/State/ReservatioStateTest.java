package State;
import org.example.State.ConfirmedState;
import org.example.State.PendingState;
import org.example.State.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ReservatioStateTest {
    Reservation reservation;
    @BeforeEach
    void setUp(){
        reservation = new Reservation();
    }
    @Test
    void deveRetornarEstadoPendente(){
        assertEquals("Reserva pendente", reservation.toString());

    }
    @Test
    void deveRetornarEstadoConfirmado(){
        reservation.handle();
        assertEquals("Reserva Confirmada", reservation.toString());

    }

}
