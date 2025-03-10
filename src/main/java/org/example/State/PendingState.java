package org.example.State;

public class PendingState implements ReservationState{
    @Override
    public String getEstado() {
        return "Reserva pendente";
    }

    @Override
    public void handleState(Reservation context) {
        context.setState(new ConfirmedState());
    }
}
