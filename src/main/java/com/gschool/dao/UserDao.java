package com.gschool.dao;

import com.gschool.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();
}
