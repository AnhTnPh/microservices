package com.auth.fuauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FuAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuAuthApplication.class, args);
    }

}
