package org.example.Flyweight;

import org.example.AbstractFactory.TicketCreator;

public class Ticket implements ITicket{
    private String type;
    public Ticket(String type){
        this.type = type;
    }
    public Ticket(TicketCreator creator){
        this.type =creator.createTicket();
    }
    public String reserve(){
        return "Reserva de ingresso do tipo: " + type;
    }
    public String getType(){
        return this.type;
    }
}
