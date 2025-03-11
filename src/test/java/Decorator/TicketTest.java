package Decorator;
import org.example.AbstractFactory.TicketCreator;
import org.example.AbstractFactory.VIPTicketCreator;
import org.example.Decorator.OpenBarAccess;
import org.example.Flyweight.ITicket;
import org.example.Flyweight.Ticket;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TicketTest {
    @Test
    void deveRetornarTipoTicketVIP(){
        TicketCreator creator = new VIPTicketCreator();
        ITicket ticket = new Ticket(creator);
        assertEquals("VIP", ticket.getType());
    }
    @Test
    void deveRetornarTipoTicketVIPComOpenBarAccess(){
        TicketCreator creator = new VIPTicketCreator();
        ITicket ticket = new OpenBarAccess(new Ticket(creator));
        assertEquals("VIP/OpenBar", ticket.getType());
    }
}
