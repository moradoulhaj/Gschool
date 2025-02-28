package com.gschool.services;

import com.gschool.entities.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
}