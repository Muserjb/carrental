package main.java.com.carrental.dao;

import java.util.List;

import main.java.com.carrental.models.Car;

public interface CarDAO {
    List<Car> getAllCars();
    Car getCarById(int carId);
    void addCar(Car car);
    void updateCar(Car car);
    void deleteCar(int carId);
}