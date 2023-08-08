package main.java.com.carrental.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.carrental.models.Car;
import main.java.com.carrental.util.DBUtil;

public class CarDAOImpl implements CarDAO {

    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();

        // Step 1: Establish the database connection
        try (Connection connection = DBUtil.getConnection()) {
            // Step 2: Create a prepared statement
            String query = "SELECT * FROM car";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Step 3: Execute the query and retrieve the result set
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Step 4: Process the result set and populate the list of cars
                    while (resultSet.next()) {
                        Car car = new Car();
                        car.setCarId(resultSet.getInt("car_id"));
                        car.setCarName(resultSet.getString("car_name"));
                        car.setCarMake(resultSet.getString("car_make"));
                        car.setCarType(resultSet.getString("car_type"));
                        car.setCarYear(resultSet.getInt("car_year"));
                        car.setCarPrice(resultSet.getDouble("car_price"));
                        car.setCarImage(resultSet.getString("car_image"));
                        cars.add(car);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }

        return cars;
    }

    @Override
    public Car getCarById(int carId) {
        Car car = null;

        // Step 1: Establish the database connection
        try (Connection connection = DBUtil.getConnection()) {
            // Step 2: Create a prepared statement
            String query = "SELECT * FROM car WHERE car_id=?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Step 3: Set the parameter (carId) in the prepared statement
                statement.setInt(1, carId);

                // Step 4: Execute the query and retrieve the result set
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Step 5: Check if a car with the given carId exists
                    if (resultSet.next()) {
                        // Step 6: Populate the Car object with the retrieved data
                        car = new Car();
                        car.setCarId(resultSet.getInt("car_id"));
                        car.setCarName(resultSet.getString("car_name"));
                        car.setCarMake(resultSet.getString("car_make"));
                        car.setCarType(resultSet.getString("car_type"));
                        car.setCarYear(resultSet.getInt("car_year"));
                        car.setCarPrice(resultSet.getDouble("car_price"));
                        car.setCarImage(resultSet.getString("car_image"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }

        return car;
    }
    
    

    @Override
    public void addCar(Car car) {
        try (Connection connection = DBUtil.getConnection()) {
            String query = "INSERT INTO car (car_name, car_make, car_type, car_year, car_price, car_image) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, car.getCarName());
                statement.setString(2, car.getCarMake());
                statement.setString(3, car.getCarType());
                statement.setInt(4, car.getCarYear());
                statement.setDouble(5, car.getCarPrice());
                statement.setString(6, car.getCarImage());

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }
    }

    @Override
    public void updateCar(Car car) {
    	 try (Connection connection = DBUtil.getConnection()) {
    	        String query = "UPDATE car SET car_name=?, car_make=?, car_type=?, car_year=?, car_price=?, car_image=? WHERE car_id=?";
    	        try (PreparedStatement statement = connection.prepareStatement(query)) {
    	            statement.setString(1, car.getCarName());
    	            statement.setString(2, car.getCarMake());
    	            statement.setString(3, car.getCarType());
    	            statement.setInt(4, car.getCarYear());
    	            statement.setDouble(5, car.getCarPrice());
    	            statement.setString(6, car.getCarImage());
    	            statement.setInt(7, car.getCarId());

    	            statement.executeUpdate();
    	        }
    	    } catch (SQLException e) {
    	        e.printStackTrace();
    	        // Handle exceptions or log errors appropriately
    	    }
    	}

    @Override
    public void deleteCar(int carId) {
        try (Connection connection = DBUtil.getConnection()) {
            String query = "DELETE FROM car WHERE car_id=?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, carId);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }
    }
}
