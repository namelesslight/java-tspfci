package com.example.javatspfci;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.example.javatspfci.code.mapper")
public class JavaTspfciApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaTspfciApplication.class, args);
    }

}
