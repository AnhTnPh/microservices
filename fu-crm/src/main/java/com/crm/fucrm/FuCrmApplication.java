package com.crm.fucrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
public class FuCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(FuCrmApplication.class, args);
    }

}
