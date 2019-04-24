package com.qf.j1808.service.impl;

import com.qf.j1808.Student;
import com.qf.j1808.mapper.StudentMapper;
import com.qf.j1808.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> queryAll() {
        return studentMapper.findAll();
    }
}
