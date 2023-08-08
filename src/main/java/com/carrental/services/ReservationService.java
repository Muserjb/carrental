package main.java.com.carrental.services;

import java.util.List;

import main.java.com.carrental.models.Reservation;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Reservation getReservationById(int reservationId);
    void addReservation(Reservation reservation);
    void updateReservation(Reservation reservation);
    void deleteReservation(int reservationId);
}
