package com.zzs.myblogconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyblogProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(MyblogProvider2Application.class, args);
    }
}
