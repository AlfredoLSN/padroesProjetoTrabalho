package AbstractFactory;

import org.example.AbstractFactory.StandardTicketCreator;
import org.example.AbstractFactory.TicketCreator;
import org.example.AbstractFactory.VIPTicketCreator;
import org.example.Flyweight.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {
    @Test
    void deveCriarTicketDoTipoVip(){
        TicketCreator creator = new VIPTicketCreator();
        Ticket ticket = new Ticket(creator);
        assertEquals("VIP", ticket.getType());
    }
    @Test
    void deveCriarTicketDoTipoStandard(){
        TicketCreator creator = new StandardTicketCreator();
        Ticket ticket = new Ticket(creator);
        assertEquals("Standard", ticket.getType());
    }
}
