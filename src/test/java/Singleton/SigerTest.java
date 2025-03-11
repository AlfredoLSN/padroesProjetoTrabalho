package Singleton;
import org.example.Singleton.Siger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SigerTest {
    @Test
    void deveRetornarVersao(){
        Siger.getInstance().setVersion("1.2");
        assertEquals("1.2", Siger.getInstance().getVersion());
    }
    @Test
    void deveRetornarReservasMax(){
        Siger.getInstance().setMaxReservation(10);
        assertEquals(10, Siger.getInstance().getMaxReservation());
    }
}
