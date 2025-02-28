package com.gschool.dao;

import com.gschool.entities.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentDao {
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
}
