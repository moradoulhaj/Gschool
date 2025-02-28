package com.gschool.beans;

import com.gschool.entities.User;
import com.gschool.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
public class UserBean {

    @Autowired
    private UserService userService;

    private User user = new User();
    private List<User> users;

    public void saveUser() {
        userService.saveUser(user);
        user = new User(); // Reset the form
    }

    public List<User> getUsers() {
        if (users == null) {
            users = userService.getAllUsers();
        }
        return users;
    }

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}