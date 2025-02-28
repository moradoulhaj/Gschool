package com.gschool.dao;

import com.gschool.entities.Filiere;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class FiliereDaoImpl extends HibernateDaoSupport implements FiliereDao {
    @Autowired
    public FiliereDaoImpl(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
    @Override
    public void saveFiliere(Filiere filiere) {
        getHibernateTemplate().save(filiere);

    }

    @Override
    public void updateFiliere(Filiere filiere) {
        getHibernateTemplate().update(filiere);

    }

    @Override
    public void deleteFiliere(Filiere filiere) {
        getHibernateTemplate().delete(filiere);

    }

    @Override
    public Filiere getFiliere(int id) {
        return getHibernateTemplate().get(Filiere.class, id);
    }

    @Override
    public List<Filiere> getFilieres() {
        return getHibernateTemplate().loadAll(Filiere.class);
    }
}
