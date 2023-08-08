package main.java.com.carrental.models;
public class Car {
    private int carId;
    private String carName;
    private String carMake;
    private String carType;
    private int carYear;
    private double carPrice;
    private String carImage;
    
    
    
    
    public Car(String carName, String carMake, String carType, int carYear, double carPrice, String carImage) {
        this.carId = carId;
        this.carName = carName;
        this.carMake = carMake;
        this.carType = carType;
        this.carYear = carYear;
        this.carPrice = carPrice;
        this.carImage = carImage;
    }   
    
    
    
	public Car() {
		// TODO Auto-generated constructor stub
	}




	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarImage() {
		return carImage;
	}
	public void setCarImage(String carImage) {
		this.carImage = carImage;
	}

    // Constructor
    // Getters and Setters
    
    
    
    
}
