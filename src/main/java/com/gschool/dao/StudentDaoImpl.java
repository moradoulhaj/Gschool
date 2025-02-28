package com.gschool.dao;

import com.gschool.entities.Student;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
    @Autowired
    public StudentDaoImpl(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }
    @Override
    public void saveStudent(Student student) {
        getHibernateTemplate().save(student);

    }

    @Override
    public void updateStudent(Student student) {
        getHibernateTemplate().update(student);

    }

    @Override
    public void deleteStudent(Student student) {
        getHibernateTemplate().delete(student);

    }

    @Override
    public Student getStudentById(int id) {
        return getHibernateTemplate().get(Student.class, id);
    }

    @Override
    public List<Student> getStudents() {
        return getHibernateTemplate().loadAll(Student.class);
    }
}
