package main.java.com.carrental.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carRentalManagementSystem.controller.JWAView;
import main.java.com.carrental.dao.ResevationDAO;
import main.java.com.carrental.dao.ResevationDAOImpl;
import main.java.com.carrental.models.Reservation;
import main.java.com.carrental.services.ReservationService;
import main.java.com.carrental.services.ReservationServiceImpl;
import main.java.com.carrental.util.ServletUtility;
@WebServlet("/reservationControllerServlet")
public class ReservationControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET request for listing reservations
        ResevationDAO reservationDAO = new ResevationDAOImpl();
        ReservationService reservationService = new ReservationServiceImpl(reservationDAO);
        List<Reservation> reservations = reservationService.getAllReservations();
        System.out.print("yes");
        request.setAttribute("reservations", reservations);
        request.getRequestDispatcher(JWAView.reservationView).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle POST request for adding a reservation
        int carId = 1;//Integer.parseInt(request.getParameter("carId"));
        //int reservationId = 2;//Integer.parseInt(request.getParameter("reservationId"));
        int userId = 2; //Integer.parseInt(request.getParameter("userId"));
        String full_name = request.getParameter("full_name");
        String pickupDateStr = request.getParameter("pick_Up_date");
        String returnDateStr = request.getParameter("return_date");
        String status = "yes"; //request.getParameter("status");
        String createdAtStr =   request.getParameter("pick_Up_date");
        // Other reservation data
        System.out.print("yes");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
        	//String pickupDateStr = request.getParameter("pick_Up_date");
            Date pickupDate = dateFormat.parse(pickupDateStr);
            Date returnDate = dateFormat.parse(returnDateStr);
            Date createdAt = dateFormat.parse(createdAtStr);

            ResevationDAO reservationDAO = new ResevationDAOImpl();
            ReservationService reservationService = new ReservationServiceImpl(reservationDAO);
            System.out.print("yes here");
            Reservation newReservation = new Reservation(carId, userId, pickupDate, returnDate, status, createdAt /* other fields */);
            System.out.print("yes constructor is working");
            reservationService.addReservation(newReservation);
            ServletUtility.setSuccessMessage("Record added Successfully ...", request);
            request.getRequestDispatcher(JWAView.addReservationView).forward(request, response);
            
        } catch (ParseException e) {
            // Handle the ParseException (log or provide an error response)
            e.printStackTrace();
        }
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 // Handle PUT request for updating a reservation
        int reservationId = Integer.parseInt(request.getParameter("reservationId"));
        String status = request.getParameter("status"); // Get updated status
        
        ResevationDAO reservationDAO = new ResevationDAOImpl();
        ReservationService reservationService = new ReservationServiceImpl(reservationDAO);
        
        // Get the existing reservation to update
        Reservation existingReservation = reservationService.getReservationById(reservationId);
        
        // Update the reservation data
        existingReservation.setStatus(status);
        
        // Update the reservation using the service
        reservationService.updateReservation(existingReservation);
        
        response.sendRedirect(request.getContextPath() + "/reservations/admin/reservation_listing");
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle DELETE request for deleting a reservation
        int reservationId = Integer.parseInt(request.getParameter("reservationId"));
        
        ResevationDAO reservationDAO = new ResevationDAOImpl();
        ReservationService reservationService = new ReservationServiceImpl(reservationDAO);
        reservationService.deleteReservation(reservationId);
        
        response.sendRedirect(request.getContextPath() + "/reservations/admin/reservation_listing");
    }

    // Implement other methods as needed
}
