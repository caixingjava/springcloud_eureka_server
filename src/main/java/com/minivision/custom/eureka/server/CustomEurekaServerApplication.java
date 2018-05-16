package com.minivision.custom.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CustomEurekaServerApplication {

    public static void main(String[] args){
        SpringApplication.run(CustomEurekaServerApplication.class, args);
        
    }
    
}
