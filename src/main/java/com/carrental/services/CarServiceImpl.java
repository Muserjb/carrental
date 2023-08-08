package main.java.com.carrental.services;

import java.util.List;

import main.java.com.carrental.dao.CarDAO;
import main.java.com.carrental.models.Car;

public class CarServiceImpl implements CarService {

    private final CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    @Override
    public Car getCarById(int carId) {
        return carDAO.getCarById(carId);
    }

    @Override
    public void addCar(Car car) {
        carDAO.addCar(car);
    }

    @Override
    public void updateCar(Car car) {
        carDAO.updateCar(car);
    }

    @Override
    public void deleteCar(int carId) {
        carDAO.deleteCar(carId);
    }
}
