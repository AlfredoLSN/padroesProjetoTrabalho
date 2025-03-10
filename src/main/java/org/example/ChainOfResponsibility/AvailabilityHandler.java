package org.example.ChainOfResponsibility;

public class AvailabilityHandler extends Handler{
    public AvailabilityHandler(Handler nextHandler){
        setNextHandler(nextHandler);
    }
    @Override
    public String processReservation(String request) {
        if(request.equals("Check Availability")){
            return "Verificando disponibilidade de ingresso...";
        } else{
            if(nextHandler != null){
                return nextHandler.processReservation(request);
            }
            return "Invalid Request";
        }
    }
}
