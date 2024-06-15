package com.example.registrationform.service;

import com.example.registrationform.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
