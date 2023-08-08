package main.java.com.carrental.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import carRentalManagementSystem.controller.JWAView;
import main.java.com.carrental.dao.UserDAO;
import main.java.com.carrental.dao.UserDAOImpl;
import main.java.com.carrental.models.User;
import main.java.com.carrental.services.UserService;
import main.java.com.carrental.services.UserServiceImpl;

@WebServlet("/UserControllerServlet")
public class UserControllerServlet extends HttpServlet {

    private final UserDAO userDAO = new UserDAOImpl();
    private final UserService userService = new UserServiceImpl(userDAO);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = userService.getAllUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher(JWAView.userViewList).forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullName = request.getParameter("firstName");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        // Other user data
        
        User newUser = new User(username, password, fullName, firstName, lastName, email, phoneNumber /* other fields */);
        userService.addUser(newUser);
        
        response.sendRedirect(request.getContextPath() + "/users/admin/user_listing");
    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        
        User updatedUser = new User(userId, firstName, lastName, email, phoneNumber /* other fields */);
        userService.updateUser(updatedUser);
        
        response.sendRedirect(request.getContextPath() + "/users/admin/user_listing");
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("userId"));
        
        userService.deleteUser(userId);
        
        response.sendRedirect(request.getContextPath() + "/users/admin/user_listing");
    }

    // Implement other methods as needed
}
