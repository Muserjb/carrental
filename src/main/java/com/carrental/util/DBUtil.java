package main.java.com.carrental.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {


//    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/carrental";
//    private static final String DATABASE_USERNAME = "root";
//    private static final String DATABASE_PASSWORD = "root";
//
//    public static Connection getConnection() throws SQLException {
//        return DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
//    }
	
	
	
//	    private static final String DB_URL = "jdbc:mysql:///carrental"; // Change to your database URL
//	    private static final String DB_USERNAME = "root"; // Change to your username
//	    private static final String DB_PASSWORD = "root"; // Change to your password

	
	private static String url = "jdbc:mysql:///carrental";
	 private static	String username = "root";
	 private static String password = "root";
	//Connection con;
	 
	 public static String getUrl() {
			return url;
		}

		public static String getUsername() {
			return username;
		}

		public static String getPassword() {
			return password;
		}

	public static Connection getConnection() {
	
		try {
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create the connection
		Connection con = DriverManager.getConnection(getUrl(), getUsername(), getPassword());	
		return con;
		}catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to connect to the database");
        }
		
	}
	
	
	

	    public static void main(String[] args) {
	        try {
	            Connection connection = DBUtil.getConnection();
	            if (connection != null) {
	                System.out.println("Connected to the database successfully!");
	                connection.close();
	            } else {
	                System.out.println("Failed to connect to the database.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("An error occurred while testing the database connection.");
	        }
	    }

	
	
	
	

	public static Statement createStmt() throws SQLException, ClassNotFoundException {
		//create the statement 
		Statement stmt;		
		stmt = getConnection().createStatement();
		return stmt;
			
	}
		
	   /* public static Connection getConnectionn() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Failed to connect to the database");
	        }
	    }
	
	*/
}