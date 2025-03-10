package org.example.Observer;

import org.example.State.Reservation;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String name;

    private String lastNotification;

    public User(String name){
        this.name = name;
    }

    public String getLastNotification(){
        return lastNotification;
    }

    public void book(Reservation reservation){
        reservation.addObserver(this);
    }

    @Override
    public void update(Observable reservation, Object arg1) {
        this.lastNotification = reservation.toString();
    }
}
