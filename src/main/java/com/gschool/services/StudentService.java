package com.gschool.services;

import com.gschool.entities.Student;
import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
    Student getStudentById(int id);
    List<Student> getAllStudents();
}