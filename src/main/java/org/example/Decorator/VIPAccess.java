package org.example.Decorator;

import org.example.Flyweight.Ticket;

public class VIPAccess extends TicketDecorator{

    public VIPAccess(Ticket ticket) {
        super(ticket);
    }

    @Override
    public String getTypeName() {
        return "VIP";
    }
}
