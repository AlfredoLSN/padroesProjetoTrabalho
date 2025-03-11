package Bridge;
import org.example.Bridge.EventManager;
import org.example.Bridge.OnlineEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OnlineEventTest {
    @Test
    void deveCriarEventoOnline(){
        OnlineEvent onlineEvent = new OnlineEvent();
        EventManager manager = new EventManager(onlineEvent);
        assertEquals("Evento online criado", manager.create());
    }
}
