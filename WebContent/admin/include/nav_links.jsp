<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@page import="carRentalManagementSystem.controller.JWAView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="en">
<% String userSession = (String) session.getAttribute("user"); %>
<jsp:include page="header.jsp">
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