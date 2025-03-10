package org.example.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TicketFactory {
    private static Map<String, Ticket> tickets = new HashMap<>();
    public static Ticket getTicket(String type){
        Ticket ticket = tickets.get(type);
        if(ticket == null){
            ticket = new Ticket(type);
            tickets.put(type, ticket);
        }
        return ticket;
    }

    public static int getTotalTickets(){
        return tickets.size();
    }
}
