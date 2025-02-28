package com.gschool.services;

import com.gschool.dao.UserDao;
import com.gschool.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);

    }

    @Override
    public User getUserById(int id) {

        return userDao.getUserById(id) ;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
