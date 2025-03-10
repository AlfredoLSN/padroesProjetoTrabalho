package org.example.ChainOfResponsibility;

public class ConfirmationHandler extends Handler{
    public ConfirmationHandler(Handler nextHandler){
        setNextHandler(nextHandler);
    }
    @Override
    public String processReservation(String request) {
        if(request.equals("Confirm Reservation")){
            return "Confirmando a reserva...";
        } else{
            if(nextHandler != null){
                return nextHandler.processReservation(request);
            }
            return "Invalid Request";
        }
    }
}
