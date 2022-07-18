package com.example.learning.demo.service;

import com.example.learning.demo.model.Student;
import com.example.learning.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student fetchStudentById(int id){
        Optional<Student>  student = studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        else
        {
            return null;
        }
    }
}
