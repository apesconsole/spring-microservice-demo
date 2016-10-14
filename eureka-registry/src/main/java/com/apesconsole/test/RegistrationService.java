package com.apesconsole.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistrationService {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationService.class, args);
    }
}
