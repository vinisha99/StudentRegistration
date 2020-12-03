package com.example.universityinfo.controller;

import com.example.universityinfo.model.Student;
import com.example.universityinfo.service.StudentService;
import com.example.universityinfo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/all")
    public List<Student> getAllData(){
        return this.studentService.getAllStudents();

    }

    @RequestMapping(method= RequestMethod.POST, value="/all")
    public String insertStudentInfo(@RequestBody Student student){
        return this.studentService.insertStudentInfo(student);

    }


}
