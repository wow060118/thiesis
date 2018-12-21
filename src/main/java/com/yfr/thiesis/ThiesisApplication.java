package com.yfr.thiesis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yfr.thiesis.dao")
public class ThiesisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThiesisApplication.class, args);
    }

}

