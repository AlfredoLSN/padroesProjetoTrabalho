package org.example.Bridge;

public class OnlineEvent implements Event{
    @Override
    public String createEvent(){
        return "Evento online criado";
    }
}
