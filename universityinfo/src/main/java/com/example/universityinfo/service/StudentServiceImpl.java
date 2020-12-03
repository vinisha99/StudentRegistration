package com.example.universityinfo.service;

import com.example.universityinfo.model.Student;
import com.example.universityinfo.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService{

@Autowired
private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public Student getSpecificStudent(Integer id) {
        return null;
    }

    @Override
    public String getUpdatedStudent(Integer id, Student student) {
        return null;
    }

    @Override
    public String deleteStudent(Integer id) {
        return null;
    }

    @Override
    public String insertStudentInfo(Student student) {
        this.studentRepository.save(student);
        return "Inserted Data Successfully";
    }
}
