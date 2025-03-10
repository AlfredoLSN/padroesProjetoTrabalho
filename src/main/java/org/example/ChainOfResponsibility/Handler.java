package org.example.ChainOfResponsibility;

public abstract class Handler {
    protected Handler nextHandler;
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    public abstract String processReservation(String request);
}
