package org.example.AbstractFactory;

import org.example.Flyweight.Ticket;

public class StandardTicketCreator extends TicketCreator{
    @Override
    public String createTicket() {
        return "Standard";
    }
}
