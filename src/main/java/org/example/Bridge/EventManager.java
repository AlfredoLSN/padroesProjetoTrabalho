package org.example.Bridge;

public class EventManager extends EventCreator{
    public EventManager(Event event) {
        super(event);
    }

    @Override
    public String create() {
        return this.event.createEvent();
    }
}
