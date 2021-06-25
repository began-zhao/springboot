package com.begin.boot05adminserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.begin.boot05adminserver.mapper")
@SpringBootApplication
public class Boot05AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot05AdminServerApplication.class, args);
    }

}
