package org.example.State;

import java.util.Observable;

public class Reservation extends Observable {
    private ReservationState state;
    public Reservation(){
        state = new PendingState();
    }
    public void setState(ReservationState state){
        this.state = state;
    }
    public void handle(){
        state.handleState(this);
        setChanged();
        notifyObservers();
    }
    public String toString(){
        return state.getEstado();
    }
}
