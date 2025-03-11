package org.example.Decorator;

import org.example.Flyweight.Ticket;

public class OpenBarAccess extends TicketDecorator{

    public OpenBarAccess(Ticket ticket) {
        super(ticket);
    }

    @Override
    public String getTypeName() {
        return "OpenBar";
    }
}
