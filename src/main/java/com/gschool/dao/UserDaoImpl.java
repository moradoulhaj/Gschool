package com.gschool.dao;

import com.gschool.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
    @Override
    public void saveUser(User user) {
        getHibernateTemplate().save(user);

    }

    @Override
    public void updateUser(User user) {
        getHibernateTemplate().update(user);
    }

    @Override
    public void deleteUser(User user) {
        getHibernateTemplate().delete(user);

    }

    @Override
    public User getUserById(int id) {
        return getHibernateTemplate().get(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        return getHibernateTemplate().loadAll(User.class);
    }
}
