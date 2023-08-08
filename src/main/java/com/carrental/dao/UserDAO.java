package main.java.com.carrental.dao;

import java.util.List;

import main.java.com.carrental.models.User;

public interface UserDAO {

	List<User> getAllUser();

	User getUserById(int userId);

	void addUser(User user);

	void updateUser(User user);

	void deleteUser(int userId);

	User UserLogin(String username, String password);

}
