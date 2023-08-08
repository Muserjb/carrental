package main.java.com.carrental.models;

import java.sql.Date;

public class User {
	private int userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone; // Optional field for phone number
	private String role; // User role: Admin or Customer
	private Date createdAt;
	private String fullName;

	public User(String username, String password, String fullName, String firstName, String lastName, String email, String phone) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public User(int userId2, String firstName2, String lastName2, String email2, String phoneNumber) {
		// TODO Auto-generated constructor stub
		this.userId = userId2;
		this.password = password;
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.email = email2;
		this.phone = phoneNumber;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


}
