package com.festus.week7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages={"com.festus.week7.dao", "com.festus.week7.service"})
public class Week7Application {

    public static void main(String[] args) {
        SpringApplication.run(Week7Application.class, args);
    }

}
