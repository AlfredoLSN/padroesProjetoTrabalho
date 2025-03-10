package org.example.Bridge;

public abstract class EventCreator {
    protected Event event;
    public EventCreator(Event event){
        this.event = event;
    }

    public abstract String create();
}
