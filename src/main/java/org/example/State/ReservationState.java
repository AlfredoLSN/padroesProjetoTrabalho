package org.example.State;

public interface ReservationState {
    String getEstado();
    void handleState(Reservation reservation);
}
