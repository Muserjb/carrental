package main.java.com.carrental.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carRentalManagementSystem.controller.JWAView;
import main.java.com.carrental.dao.CarDAO;
import main.java.com.carrental.dao.CarDAOImpl;
import main.java.com.carrental.dao.ResevationDAO;
import main.java.com.carrental.dao.ResevationDAOImpl;
import main.java.com.carrental.dao.UserDAO;
import main.java.com.carrental.dao.UserDAOImpl;
import main.java.com.carrental.services.CarService;
import main.java.com.carrental.services.CarServiceImpl;
import main.java.com.carrental.services.ReservationService;
import main.java.com.carrental.services.ReservationServiceImpl;
import main.java.com.carrental.services.UserService;
import main.java.com.carrental.services.UserServiceImpl;
import main.java.com.carrental.util.ServletUtility;

/**
 * Servlet implementation class DeleteCTL
 */
@WebServlet("/DeleteCTL")
public class DeleteCTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Car car = new Car();

		int id = Integer.parseInt(request.getParameter("id"));
		String carVar = "car";
		String userVar = "user";
		String reservationVar = "reservation";
		CarDAO carDAO = new CarDAOImpl();
		CarService carService = new CarServiceImpl(carDAO);
		if (id > 0 && carVar.matches("car")) {
			carService.deleteCar(id);
			ServletUtility.setSuccessMessage("Data Deleted Successfully", request);
			ServletUtility.forward(JWAView.carView, request, response);
		}if (id > 0 && userVar.matches("user")) {
			UserDAO userDAO = new UserDAOImpl();
			UserService userService = new UserServiceImpl(userDAO);
			userService.deleteUser(id);
//			ServletUtility.setSuccessMessage("Data Deleted Successfully", request);
//			ServletUtility.forward(JWAView.userView, request, response);
		}if (id > 0 && reservationVar.matches("reservation")) {
			ResevationDAO reservationDAO = new ResevationDAOImpl();
			ReservationService reservationService = new ReservationServiceImpl(reservationDAO);
			reservationService.deleteReservation(id);
//			ServletUtility.setSuccessMessage("Data Deleted Successfully", request);
//			ServletUtility.forward(JWAView.userView, request, response);
		}else {
			ServletUtility.setErrorMessage("Record Not Found", request);
		}

		// ServletUtility.setList(list, request);
		ServletUtility.forward(JWAView.carView, request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
