<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page import="carRentalManagementSystem.controller.JWAView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="en">
<% String userSession = (String) session.getAttribute("user"); %>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Car Rental System - Admin Dashboard</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Dashboard</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<%=JWAView.carCTL%>">Car Listings</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<%=JWAView.reservationCTL %>">Reservations</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<%=JWAView.userCTL %>">Users</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="reports.jsp">Reports</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="settings.jsp">Settings</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="<%=JWAView.LoginServlet+"?operation=logout"%>">Logout</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
<body>

	<div class="container mt-5">
		<h2>Add New Car</h2>
		
		
		
		<form action="<%=JWAView.carCTL%>" method="post">
			<div class="row">
				<div class="col-4">

					<label for="carMake" class="form-label">Car Name</label> <input
						type="text" class="form-control" id="carMake" name="car_name"
						required>

				</div>
				<div class="col-4">

					<label for="carMake" class="form-label">Car Make</label> <input
						type="text" class="form-control" id="carMake" name="car_Make"
						required>
				</div>
				<div class="col-4">
					<label for="carModel" class="form-label">Car Type</label> <input
						type="text" class="form-control" id="carModel" name="car_type"
						required>
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<label for="carYear" class="form-label">Year</label> <input
						type="number" class="form-control" id="carYear" name="car_Year"
						required>
				</div>
				<div class="col-4">
					<label for="carPrice" class="form-label">Price</label> <input
						type="text" class="form-control" id="car_Price"
						name="car_price" required>
				</div>
				<div class="col-4">
					<label for="carPrice" class="form-label">image</label> <input
						type="file"  class="form-control" id="car_image"
						name="carPrice" required>
				</div>
			</div>


			<div class=" col-4 offset-4 mt-5">
				<button type="submit" class=" form-control mt-2 btn btn-primary">Add
					Car</button>

			</div>
			<div class="mb-3"></div>

		</form>
	</div>

</body>
</html>
