package org.example.State;

public class ConfirmedState implements ReservationState{
    @Override
    public String getEstado() {
        return "Reserva Confirmada";
    }

    @Override
    public void handleState(Reservation context) {
    }
}
