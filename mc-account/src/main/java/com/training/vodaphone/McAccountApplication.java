package com.training.vodaphone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class McAccountApplication {

    public static void main(final String[] args) {
        SpringApplication.run(McAccountApplication.class,
                              args);
    }

}
