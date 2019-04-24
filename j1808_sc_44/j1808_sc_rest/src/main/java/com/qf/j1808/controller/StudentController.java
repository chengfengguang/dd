package com.qf.j1808.controller;

import com.qf.j1808.Student;
import com.qf.j1808.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "users",method = RequestMethod.GET)
    public List<Student> queryAll(){
        return studentService.queryAll();
    }
}
