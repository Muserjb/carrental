package main.java.com.carrental.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.carrental.models.Reservation;
import main.java.com.carrental.models.User;
import main.java.com.carrental.util.DBUtil;

public class UserDAOImpl implements UserDAO{

	
	 @Override
	 public List<User> getAllUser() {
	      
	 List<User> users = new ArrayList<>();
     // Step 1: Establish the database connection
     try (Connection connection = DBUtil.getConnection()) {
         // Step 2: Create a prepared statement
         String query = "SELECT * FROM user";
         try (PreparedStatement statement = connection.prepareStatement(query)) {
             // Step 3: Execute the query and retrieve the result set
             try (ResultSet resultSet = statement.executeQuery()) {
                 // Step 4: Process the result set and populate the list of reservations
                 while (resultSet.next()) {
                     User user = new User();
                     user.setUserId(resultSet.getInt("user_id"));
                     user.setUsername(resultSet.getString("username"));
                     user.setPassword(resultSet.getString("password"));
                     user.setFirstName(resultSet.getString("full_name"));
                     user.setEmail(resultSet.getString("email"));
                     user.setRole(resultSet.getString("role"));
                     user.setCreatedAt(resultSet.getDate("created_at"));
                     users.add(user);
                 }
             }
         }
     } catch (SQLException e) {
         e.printStackTrace();
         // Handle exceptions or log errors appropriately
     }

     return users;
 }


	@Override
	public User getUserById(int userId) {
		User user = null;
		// Step 1: Establish the database connection
		try (Connection connection = DBUtil.getConnection()) {
		    // Step 2: Create a prepared statement
		    String query = "SELECT * FROM user WHERE user_id=?";
		    try (PreparedStatement statement = connection.prepareStatement(query)) {
		        // Step 3: Set the parameter (userId) in the prepared statement
		        statement.setInt(1, userId);
		
		        // Step 4: Execute the query and retrieve the result set
		        try (ResultSet resultSet = statement.executeQuery()) {
		            // Step 5: Check if a reservation with the given userId exists
		            if (resultSet.next()) {
		                // Step 6: Populate the Reservation object with the retrieved data
						user = new User();
						user.setUserId(resultSet.getInt("user_id"));
						user.setUsername(resultSet.getString("username"));
						user.setPassword(resultSet.getString("password"));
						user.setFirstName(resultSet.getString("full_name"));
						//user.setLastName(resultSet.getString("last_name"));
						user.setEmail(resultSet.getString("status"));
						user.setRole(resultSet.getString("role"));
						user.setCreatedAt(resultSet.getDate("created_at"));
	                   }
		        }
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		    // Handle exceptions or log errors appropriately
		}
		
		return user;
	}
	
	
	// User UserLogin(String username, String password);
	@Override
	public User UserLogin(String username, String password) {
		User user = null;
		
		Connection connectionn = DBUtil.getConnection();
		if(connectionn != null) {
			System.out.println("yes connected successfull");
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
			//System.out.println("Query: " + query);
		}else {
			System.out.println("yes  is null");
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
		}
		
		
		
		// Step 1: Establish the database connection
		try (Connection connection = DBUtil.getConnection()) {
			// Step 2: Create a prepared statement
			String query = "SELECT username, password FROM user WHERE username=? AND password=?";
			System.out.println("Query: " + query);
			try (PreparedStatement statement = connection.prepareStatement(query)) {
			    // Step 3: Set the parameter (username and password) in the prepared statement
			    statement.setString(1, username); // Index 1 for the first parameter
			    statement.setString(2, password); // Index 2 for the second parameter
			    
		
		        // Step 4: Execute the query and retrieve the result set
		        try (ResultSet resultSet = statement.executeQuery()) {
		            // Step 5: Check if a reservation with the given userId exists
		            if (resultSet.next()) {
		                // Step 6: Populate the Reservation object with the retrieved data
						user = new User();
						user.setUsername(resultSet.getString("username"));
						user.setPassword(resultSet.getString("password"));
						user.setFirstName(resultSet.getString("full_name"));
						//user.setLastName(resultSet.getString("last_name"));
						user.setEmail(resultSet.getString("status"));
						user.setRole(resultSet.getString("role"));
						user.setCreatedAt(resultSet.getDate("created_at"));
	                   }
		        }
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		    // Handle exceptions or log errors appropriately
		}
		
		return user;
	}
	
	
	
	@Override
    public void addUser(User user) {
        // Step 1: Establish the database connection
        try (Connection connection = DBUtil.getConnection()) {
            // Step 2: Create a prepared statement
            String query = "INSERT INTO user (user_id, username, password, full_name, email, phone, role, created_at) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Step 3: Set the parameters in the prepared statement
                statement.setInt(1, user.getUserId());
                statement.setString(2, user.getUsername());
                statement.setString(3, user.getPassword());
                statement.setString(4, user.getFirstName());
                statement.setString(5, user.getEmail());
                statement.setString(6, user.getPhone());
                statement.setString(7, user.getRole());
                statement.setDate(8, user.getCreatedAt());

                // Step 4: Execute the query to add the new reservation
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions or log errors appropriately
        }
    }
	
	
	 @Override
	    public void updateUser(User user) {
	        // Step 1: Establish the database connection
	        try (Connection connection = DBUtil.getConnection()) {
	            // Step 2: Create a prepared statement
	            String query = "UPDATE user SET user_id=?, username=?, password=?, full_name=?, email=?, phone=?, role=?, created_at=? WHERE user_id=?";
	            try (PreparedStatement statement = connection.prepareStatement(query)) {
	                // Step 3: Set the parameters in the prepared statement
	            	statement.setInt(1, user.getUserId());
	                statement.setString(2, user.getUsername());
	                statement.setString(3, user.getPassword());
	                statement.setString(4, user.getFirstName());
	                statement.setString(5, user.getEmail());
	                statement.setString(6, user.getPhone());
	                statement.setString(7, user.getRole());
	                statement.setDate(8, user.getCreatedAt());

	                // Step 4: Execute the query to update the reservation
	                statement.executeUpdate();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            // Handle exceptions or log errors appropriately
	        }
	    
	    }
	 
	 
	 @Override
	    public void deleteUser(int userId) {
	    	 try (Connection connection = DBUtil.getConnection()) {
	    	        String query = "DELETE FROM user WHERE user_id=?";
	    	        try (PreparedStatement statement = connection.prepareStatement(query)) {
	    	            statement.setInt(1, userId);

	    	            statement.executeUpdate();
	    	        }
	    	    } catch (SQLException e) {
	    	        e.printStackTrace();
	    	        // Handle exceptions or log errors appropriately
	    	    }
	    	 }
	 
	 

	
	
	
	
	
	
	
}
