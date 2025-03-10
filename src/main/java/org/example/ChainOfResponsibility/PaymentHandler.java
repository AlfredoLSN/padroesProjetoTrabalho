package org.example.ChainOfResponsibility;

public class PaymentHandler extends Handler{
    public PaymentHandler(Handler nextHandler){
        setNextHandler(nextHandler);
    }
    @Override
    public String processReservation(String request) {
        if(request.equals("Payment")){
            return "Processando pagamento...";
        } else{
            if(nextHandler != null){
                return nextHandler.processReservation(request);
            }
            return "Invalid Request";
        }
    }
}
