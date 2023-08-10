package main.java.com.carrental.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import carRentalManagementSystem.controller.JWAView;
import main.java.com.carrental.dao.UserDAOImpl;
import main.java.com.carrental.models.User;
import main.java.com.carrental.services.UserServiceImpl;
import main.java.com.carrental.util.ServletUtility;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
	    String op = request.getParameter("operation");
	   try {
		   if(op.equals("logout")) {
		    	session.invalidate();
			    ServletUtility.setSuccessMessage("Logout Sucessfully",request);
			    ServletUtility.forward(JWAView.LoginView, request, response);
			 }
	   }catch(Exception e) {
		   System.out.println(e);
	   }
		    ServletUtility.setErrorMessage("You most Login first!",request);
		    ServletUtility.forward(JWAView.LoginView, request, response);
		    
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 User user 		= new User();
		// UserServiceImpl userServiceImpl = new UserServiceImpl((UserDAO) user);
	       String login	 		= request.getParameter("username");
	       String password	 	= request.getParameter("password");
	       HttpSession session 	= request.getSession();
	       
	       UserDAOImpl userDao 		= new UserDAOImpl();
	       UserServiceImpl userServiceImpl = new UserServiceImpl(userDao);
	       user = userServiceImpl.UserLogin(login, password);
	       if(user != null) {
	    	   session.setAttribute("user", login);
	           ServletUtility.setSuccessMessage(request.getParameter("username")+ " is login successfully", request);
	           //request.getRequestDispatcher(JWAView.indexView).forward(request, response);
	           ServletUtility.redirect(JWAView.indexView, request, response);
	       }else {
	           ServletUtility.setErrorMessage("Invalid User", request);
	           ServletUtility.forward(JWAView.LoginView, request, response);
	       }
	}

	
}
