package carRentalManagementSystem.controller;

public interface JWAView {

	
	public String APP_CONTEXT = "/CarRentalManagementSystem";
	public String PAGE_FOLDER = "/admin";
	
	public String homeView = APP_CONTEXT+PAGE_FOLDER+"/"+"index.jsp";
	
	//sessionControl
	//public String LoginView = PAGE_FOLDER+"/"+"admin_login.jsp";
	public String sessionControl = APP_CONTEXT+"/"+"sessionCTL";
	public String deleteCTL = APP_CONTEXT+"/"+"DeleteCTL";
	
	
	public String LoginView = PAGE_FOLDER+"/"+"admin_login.jsp";
	public String LoginServlet = APP_CONTEXT+"/"+"LoginServlet";
	
	public String carView = PAGE_FOLDER+"/"+"car_listing.jsp";
	public String carCTL = APP_CONTEXT+"/"+"CarControllerServlet";
	
	//addCarView
	public String addCarView = PAGE_FOLDER+"/"+"add_car.jsp";
	
	
	public String addUserView = PAGE_FOLDER +"/"+"add_user.jsp";
	public String UserCTL = APP_CONTEXT+"/"+"UserControlerServlet";
	
	
	//reservationCTL
	public String addReservationView = APP_CONTEXT +"/"+PAGE_FOLDER+"/"+"add_reservation.jsp";
			public String reservationView = PAGE_FOLDER+"/"+"reservation_listing.jsp";
	public String reservationCTL = APP_CONTEXT+"/"+"reservationControllerServlet";
	
	
	public String indexView = APP_CONTEXT +"/"+ PAGE_FOLDER+"/"+"index.jsp";
	public String userCTL = APP_CONTEXT+"/"+"UserControllerServlet";
	
	public String userViewList = PAGE_FOLDER+"/"+"user_listing.jsp";
	
	
	
	

	public String uploadImageView = PAGE_FOLDER+"/"+"uploadImageView.jsp";
	public String UploadImageCTL = APP_CONTEXT+"/"+"UploadImageCTL";
	





}
