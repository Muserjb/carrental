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

    

    
<body>

<div class="container mt-5">
    <h2>Add New User</h2>
		<form action="<%=JWAView.UserCTL %>" method="post">
			<div class="row">
				<div class="col-4">
					<label for="carMake" class="form-label">Username</label> <input
						type="text" class="form-control" id="carMake" name="username"
						required>
				</div>
				<div class="col-4">

					<label for="password" class="form-label">Password</label> <input
						type="text" class="form-control" id="password" name="password"
						required>
				</div>
				<div class="col-4">
					<label for="password" class="form-label">Full name</label> <input
						type="password" class="form-control" id="password" name="full_name"
						required>
				</div>
			</div>
			<div class="row">
				<div class="col-4">
					<label for=""email"" class="form-label">Email</label> <input
						type="text" class="form-control" id=""email"" name="email"
						required>
				</div>
				<div class="col-4">
					<label for=""phone"" class="form-label">Phone</label> <input
						type="number"  class="form-control" id="phone"
						name=""phone"" required>
				</div>
				<div class="col-4">
					<label for="role" class="form-label">Role</label> <input
						type="text" step="0.01" class="form-control" id="role"
						name="role" required>
				</div>
			<div class=" col-4 offset-4 mt-5">
				<button type="submit" class=" form-control mt-2 btn btn-primary">Add
					User</button>
			</div>
			<div class="mb-3"></div>

		</form>
	</div>

</body>
</html>
