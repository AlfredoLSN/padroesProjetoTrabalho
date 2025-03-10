package org.example.Bridge;

public class InPersonEvent implements Event{
    @Override
    public String createEvent() {
        return "Evento presencial criado";
    }
}
