package com.gift.starter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.gift"})
public class ApplicationStarter {


    public static void main(String[] args) {

        SpringApplication.run(ApplicationStarter.class, args);

    }
}
