package com.dxtwangxiao.questionchecktool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dxtwangxiao.questionchecktool.dao")
public class QuestionchecktoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionchecktoolApplication.class, args);
    }
}
