package com.example.universityinfo.service;

import com.example.universityinfo.model.Student;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {

    List<Student> getAllStudents();
    Student getSpecificStudent(Integer id);
    String getUpdatedStudent(Integer id ,Student student);
    String deleteStudent(Integer id);
    String insertStudentInfo(Student student);
}
