package com.gschool.dao;

import com.gschool.entities.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User getUserById(int id);
    List<User> getUsers();
}
