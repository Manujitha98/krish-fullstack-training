package com.example.learning.demo.service;

import com.example.learning.demo.model.Student;

public interface StudentService {
    Student save(Student student);
    Student fetchStudentById(int id);
}
