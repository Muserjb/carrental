package main.java.com.carrental.controllers;

import java.io.IOException;
import java.util.List;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carRentalManagementSystem.controller.JWAView;
import main.java.com.carrental.dao.CarDAO;
import main.java.com.carrental.dao.CarDAOImpl;
import main.java.com.carrental.models.Car;
import main.java.com.carrental.services.CarService;
import main.java.com.carrental.services.CarServiceImpl;
import main.java.com.carrental.util.ServletUtility;
@WebServlet("/CarControllerServlet")
public class CarControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Handle GET request for listing cars
    	CarDAO carDAO = new CarDAOImpl();
    	CarService carService = new CarServiceImpl(carDAO);
        List<Car> cars = carService.getAllCars(); // Use your CarService implementation
        request.setAttribute("cars", cars);
        request.getRequestDispatcher(JWAView.carView).forward(request, response);
        System.out.print("its coming "+cars );
    }
    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Handle POST request for adding a car
		String carName  = request.getParameter("car_name");
		String carMake  = request.getParameter("car_make");
		String carType  = request.getParameter("car_type");
		double carPrice = Double.parseDouble(request.getParameter("car_price"));
		String carImage = request.getParameter("car_image");
		int carYear 	= Integer.parseInt(request.getParameter("car_Year"));

		CarDAO carDAO = new CarDAOImpl();
		CarService carService = new CarServiceImpl(carDAO);
		Car newCar = new Car(carName, carMake, carType, carYear, carPrice, carImage); // Create a Car object
		carService.addCar(newCar); // Use your CarService implementation to add the car
		ServletUtility.setSuccessMessage("Record added Successfully ...", request);
		//response.sendRedirect(JWAView.addCarView); // Redirect to the list page
		request.getRequestDispatcher(JWAView.addCarView).forward(request, response);
	}
    
    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle PUT request for updating a car
    	  	
    	
	    	String carName = request.getParameter("car_name");
	        String carMake = request.getParameter("car_make");
         String carType = request.getParameter("car_type");
         double carPrice = Double.parseDouble(request.getParameter("car_price"));
         String carImage = request.getParameter("car_image");
         int carYear = Integer.parseInt(request.getParameter("car_Year"));
        
        Car updatedCar = new Car(carName, carMake, carType, carYear, carPrice, carImage); // Create an updated Car object
        
        CarDAO carDAO = new CarDAOImpl();
    	CarService carService = new CarServiceImpl(carDAO);
    	
        carService.updateCar(updatedCar); // Use your CarService implementation to update the car
        
        response.sendRedirect(request.getContextPath() + "/cars/admin/car_listing"); // Redirect to the list page
    }
    
    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle DELETE request for deleting a car
        int carId = Integer.parseInt(request.getParameter("carId"));
        
        CarDAO carDAO = new CarDAOImpl();
    	CarService carService = new CarServiceImpl(carDAO);
    	
        carService.deleteCar(carId); // Use your CarService implementation to delete the car
        
        response.sendRedirect(request.getContextPath() + "/cars/admin/car_listing"); // Redirect to the list page
    }



    // Implement other methods (doPost, doPut, doDelete) for adding, updating, and deleting cars
}
