package com.gschool.beans;

import com.gschool.entities.Student;
import com.gschool.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@Component
@ManagedBean
@ViewScoped
public class StudentBean {

    @Autowired
    private StudentService studentService;

    private Student student = new Student();
    private List<Student> students;

    public void saveStudent() {
        studentService.saveStudent(student);
        student = new Student(); // Reset the form
    }

    public List<Student> getStudents() {
        if (students == null) {
            students = studentService.getAllStudents();
        }
        return students;
    }

    // Getters and Setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}