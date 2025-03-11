package Observer;
import org.example.Observer.User;
import org.example.State.Reservation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class UserTest {
    @Test
    void deveNotificarUmUsuario(){
        User user = new User("Pedro");
        Reservation reservation = new Reservation();
        user.book(reservation);
        reservation.handle();
        assertEquals("Reserva Confirmada", user.getLastNotification());
    }
    @Test
    void deveNotificarDoisUsuarios(){
        User user1 = new User("Pedro");
        User user2 = new User("Lucas");
        Reservation reservation = new Reservation();
        user1.book(reservation);
        user2.book(reservation);
        reservation.handle();
        assertEquals("Reserva Confirmada", user1.getLastNotification());
        assertEquals("Reserva Confirmada", user2.getLastNotification());
    }
    @Test
    void naoDeveNotificarUsuario(){
        User user1 = new User("Pedro");
        Reservation reservation = new Reservation();
        reservation.handle();
        assertEquals(null, user1.getLastNotification());
    }
    @Test
    void deveNotificarUsuarioReserva2(){
        User user1 = new User("Pedro");
        User user2 = new User("Lucas");
        Reservation reservation1 = new Reservation();
        Reservation reservation2 = new Reservation();
        user1.book(reservation1);
        user2.book(reservation2);
        reservation2.handle();
        assertEquals(null, user1.getLastNotification());
        assertEquals("Reserva Confirmada", user2.getLastNotification());
    }

}
