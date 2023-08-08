package main.java.com.carrental.services;


import java.util.List;

import main.java.com.carrental.models.User;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int userId);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
}
