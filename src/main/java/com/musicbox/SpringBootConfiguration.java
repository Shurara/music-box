package com.musicbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConfiguration {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootConfiguration.class);
        System.out.println("server started");
    }


}
