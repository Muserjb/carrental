package main.java.com.carrental.dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.carrental.models.Reservation;
import main.java.com.carrental.util.DBUtil;

public class ResevationDAOImpl implements ResevationDAO {

    @Override
    public List<Reservation> getAllResevation() {
        List<Reservation> reservations = new ArrayList<>();
        // Step 1: Establish the database connection
        try (Connection connection = DBUtil.getConnection()) {
            // Step 2: Create a prepared statement
            String query = "SELECT * FROM reservation";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Step 3: Execute the query and retrieve the result set
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Step 4: Process the result set and populate the list of reservations
                    while (resultSet.next()) {
                        Reservation reservation = new Reservation();
                        reservation.setReservationId(resultSet.getInt("reservation_id"));
                        reservation.setCarId(resultSet.getInt("car_id"));
                        reservation.setUserId(resultSet.getInt("user_id"));
                        reservation.setPickupDate(resultSet.getDate("pickup_date"));
                        reservation.setReturnDate(resultSet.getDate("return_date"));
                        reservation.setStatus(resultSet.getString("status"));
                        reservation.setCreatedAt(resultSet.getDate("created_at"));
                        reservations.add(reservation);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }

        return reservations;
    }

    @Override
    public Reservation getResevationById(int reservationId) {
        Reservation reservation = null;

        // Step 1: Establish the database connection
        try (Connection connection = DBUtil.getConnection()) {
            // Step 2: Create a prepared statement
            String query = "SELECT * FROM reservation WHERE reservation_id=?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Step 3: Set the parameter (reservationId) in the prepared statement
                statement.setInt(1, reservationId);

                // Step 4: Execute the query and retrieve the result set
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Step 5: Check if a reservation with the given reservationId exists
                    if (resultSet.next()) {
                        // Step 6: Populate the Reservation object with the retrieved data
                        reservation = new Reservation();
                        reservation.setReservationId(resultSet.getInt("reservation_id"));
                        reservation.setCarId(resultSet.getInt("car_id"));
                        reservation.setUserId(resultSet.getInt("user_id"));
                        reservation.setPickupDate(resultSet.getDate("pickup_date"));
                        reservation.setReturnDate(resultSet.getDate("return_date"));
                        reservation.setStatus(resultSet.getString("status"));
                        reservation.setCreatedAt(resultSet.getDate("created_at"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }

        return reservation;
    }

    @Override
    public void addResevation(Reservation reservation) {
        // Step 1: Establish the database connection
        try (Connection connection = DBUtil.getConnection()) {
            // Step 2: Create a prepared statement
            String query = "INSERT INTO reservation (car_id, user_id, pickup_date, return_date, status, created_at) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Step 3: Set the parameters in the prepared statement
                statement.setInt(1, reservation.getCarId());
                statement.setInt(2, reservation.getUserId());
                //statement.setInt(3, reservation.getReservationId());
                statement.setDate(3, new Date(reservation.getPickupDate().getTime()));
                statement.setDate(4, new Date(reservation.getReturnDate().getTime()));
                statement.setString(5, reservation.getStatus());
                statement.setDate(6, new Date(reservation.getCreatedAt().getTime()));

                // Step 4: Execute the query to add the new reservation
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }
    }

    @Override
    public void updateResevation(Reservation reservation) {
        // Step 1: Establish the database connection
        try (Connection connection = DBUtil.getConnection()) {
            // Step 2: Create a prepared statement
            String query = "UPDATE reservation SET car_id=?, user_id=?, pickup_date=?, return_date=?, status=?, created_at=? WHERE reservation_id=?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Step 3: Set the parameters in the prepared statement
                statement.setInt(1, reservation.getCarId());
                statement.setInt(2, reservation.getUserId());
                statement.setDate(3, new Date(reservation.getPickupDate().getTime()));
                statement.setDate(4, new Date(reservation.getReturnDate().getTime()));
                statement.setString(5, reservation.getStatus());
                statement.setDate(6, new Date(reservation.getCreatedAt().getTime()));
                statement.setInt(7, reservation.getReservationId());

                // Step 4: Execute the query to update the reservation
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }
    
    }

    @Override
    public void deleteResevation(int reservationId) {
    	 try (Connection connection = DBUtil.getConnection()) {
    	        String query = "DELETE FROM reservation WHERE reservation_id=?";
    	        try (PreparedStatement statement = connection.prepareStatement(query)) {
    	            statement.setInt(1, reservationId);

    	            statement.executeUpdate();
    	        }
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	        // Handle exceptions or log errors appropriately
    	    }
    	 }
    }