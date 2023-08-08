package main.java.com.carrental.services;


import java.util.List;

import main.java.com.carrental.dao.ResevationDAO;
import main.java.com.carrental.models.Reservation;

public class ReservationServiceImpl implements ReservationService {

    private final ResevationDAO reservationDAO;

    public ReservationServiceImpl(ResevationDAO reservationDAO) {
        this.reservationDAO = reservationDAO;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationDAO.getAllResevation();
    }

    @Override
    public Reservation getReservationById(int reservationId) {
        return reservationDAO.getResevationById(reservationId);
    }

    @Override
    public void addReservation(Reservation reservation) {
        reservationDAO.addResevation(reservation);
    }

    @Override
    public void updateReservation(Reservation reservation) {
        reservationDAO.updateResevation(reservation);
    }

    @Override
    public void deleteReservation(int reservationId) {
        reservationDAO.deleteResevation(reservationId);
    }
}
