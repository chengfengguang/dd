package com.qf.j1808;

import com.qf.j1808.service.StuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class J1808ScProtalApplicationTests {
    @Autowired
    private StuService stuService;
    @Test
    public void contextLoads() {
        List<Student> students = stuService.queryAll();
        System.out.println("ok1");
    }

}
