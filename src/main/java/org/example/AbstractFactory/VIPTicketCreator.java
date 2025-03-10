package org.example.AbstractFactory;

import org.example.Flyweight.Ticket;

public class VIPTicketCreator extends TicketCreator{
    @Override
    public String createTicket() {
        return "VIP";
    }
}
