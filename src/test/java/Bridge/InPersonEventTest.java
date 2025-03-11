package Bridge;
import org.example.Bridge.EventManager;
import org.example.Bridge.InPersonEvent;
import org.example.Bridge.OnlineEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InPersonEventTest {
    @Test
    void deveCriarEventoPresencial(){
        InPersonEvent inPersonEvent = new InPersonEvent();
        EventManager manager = new EventManager(inPersonEvent);
        assertEquals("Evento presencial criado", manager.create());
    }
}
