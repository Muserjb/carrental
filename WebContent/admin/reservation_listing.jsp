<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="carRentalManagementSystem.controller.JWAView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
    <!-- Admin Navbar -->
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

    

    <!-- Reservations Content -->
    <div class="container mt-4">
        <h2 class="mb-4">Reservations</h2>
		<div class="container mt-2 mb-1">
		    <a href="admin/add_reservation.jsp" class="btn btn-dark">Add New Reservation </a>
		</div>
        <!-- Reservation Table -->
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th scope="col">Reservation ID</th>
                    <th scope="col">User</th>
                    <th scope="col">Car</th>
                    <th scope="col">Pickup Date</th>
                    <th scope="col">Return Date</th>
                    <th scope="col">Status</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <!-- Sample Reservation Rows (Repeat this for each reservation) -->
                 <c:forEach items="${reservations}" var="reservation">
                <tr>
                    <td>${reservation.reservationId}</td>
                    <td>${reservation.carId}</td>
                    <td>${reservation.userId}</td>
                    <td>${reservation.pickupDate}</td>
                    <td>${reservation.returnDate}</td>
                    <td>${reservation.status}</td>
                    <td>
                        <a href="" class="btn btn-info">edit </a>
		    			<a href="<%=JWAView.deleteCTL %>?id=${reservation.reservationId}" class="btn btn-danger">delete</a>
		
                       
                       
                       
                       
                    </td>
                    
                    <!-- Add other table data -->
                </tr>
            </c:forEach> 
            </tbody>
        </table>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
