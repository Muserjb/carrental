package main.java.com.carrental.models;


import java.util.Date;

public class Reservation {
    private int reservationId;
    private int carId;
    private int userId;
    private Date pickupDate;
    private Date returnDate;
    private String status;
    private Date createdAt;
    
    
    
    
 
    
    
	public Reservation(int carId, int userId, Date pickupDate, Date returnDate, String status,
			Date createdAt) {
		super();
		this.reservationId = reservationId;
		this.carId = carId;
		this.userId = userId;
		this.pickupDate = pickupDate;
		this.returnDate = returnDate;
		this.status = status;
		this.createdAt = createdAt;
	}


	public Reservation(int reservationId2) {
		this.reservationId  = reservationId2;
	}
	
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}


	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

    // Constructor
    // Getters and Setters
    
    
    
    
    
}
