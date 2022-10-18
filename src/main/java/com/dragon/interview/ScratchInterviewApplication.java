package com.dragon.interview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dragon.interview.*.mapper")
public class ScratchInterviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScratchInterviewApplication.class, args);
    }

}
