package org.example.Decorator;

import org.example.Flyweight.ITicket;
import org.example.Flyweight.Ticket;

public abstract class TicketDecorator implements ITicket {
    private Ticket ticket;
    public String type;

    public TicketDecorator(Ticket ticket){
        this.ticket = ticket;
    }

    public Ticket getTicket(){
        return ticket;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public abstract String getTypeName();

    public String getType(){
        return this.ticket.getType() + "/" + this.getTypeName();
    }

    public void setType(String type){
        this.type = type;
    }
}
