package com.qf.j1808;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.j1808.mapper")
public class J1808ScRestApplication {

    public static void main(String[] args) {

        SpringApplication.run(J1808ScRestApplication.class, args);
    }

}
