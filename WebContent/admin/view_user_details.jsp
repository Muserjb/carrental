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

    

    <!-- User Details Content -->
    <div class="container mt-4">
        <h2>User Details</h2>

        <div class="card">
            <div class="card-body">
                <h5 class="card-title">User A</h5>
                <p class="card-text"><strong>Email:</strong> usera@example.com</p>
                <p class="card-text"><strong>Phone:</strong> +123 456 7890</p>
                <p class="card-text"><strong>Address:</strong> 123, Street, City, Country</p>
                <p class="card-text"><strong>DOB:</strong> 1990-01-01</p>
                <!-- Add more user details here if needed -->
                <a href="#" class="btn btn-primary">Edit</a>
                <a href="#" class="btn btn-danger">Delete</a>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

</html>
