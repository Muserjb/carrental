package main.java.com.carrental.services;




import java.util.List;

import main.java.com.carrental.dao.UserDAO;
import main.java.com.carrental.models.User;

public class UserServiceImpl implements UserService {

    private final  UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUser();
    }

    @Override
    public User getUserById(int userId) {
        return userDAO.getUserById(userId);
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userDAO.deleteUser(userId);
    }

	public User UserLogin(String username, String password) {
		return userDAO.UserLogin(username, password);
	}
}
