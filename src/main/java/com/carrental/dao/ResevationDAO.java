package main.java.com.carrental.dao;

import java.util.List;

import main.java.com.carrental.models.Reservation;

public interface ResevationDAO {

	List<Reservation> getAllResevation();
	Reservation getResevationById(int reservationId);
	void addResevation(Reservation reservation);
	void updateResevation(Reservation reservation);
	void deleteResevation(int reservationId);

}
