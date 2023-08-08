package carRentalManagementSystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.com.carrental.dao.UserDAOImpl;
import main.java.com.carrental.models.User;
import main.java.com.carrental.services.UserServiceImpl;
import main.java.com.carrental.util.ServletUtility;

/**
 * Servlet implementation class LoginServlet
 */
//, urlPatterns = { "/LoginServlett" }
@WebServlet("/LoginServlett")
public class LoginServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlett() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 		User user 		= new User();
		 		// UserServiceImpl userServiceImpl = new UserServiceImpl((UserDAO) user);
		       String login	 		= request.getParameter("username");
		       String password	 	= request.getParameter("password");
		       HttpSession session 	= request.getSession(true);
		       
		       UserDAOImpl userServiceImplu	= new UserDAOImpl();
		       UserServiceImpl userServiceImpl = new UserServiceImpl(userServiceImplu);
		       user = userServiceImpl.UserLogin(login, password);
		       if(user != null) {
		    	   session.setAttribute("user", user.getFirstName());
		           ServletUtility.setSuccessMessage(request.getParameter("username")+ " is login successfully", request);
		          ServletUtility.redirect(JWAView.userCTL, request, response);
		       }else {
		           ServletUtility.setErrorMessage("Invalid User", request);
		           ServletUtility.forward(JWAView.LoginView, request, response);
		       }
		}

}
