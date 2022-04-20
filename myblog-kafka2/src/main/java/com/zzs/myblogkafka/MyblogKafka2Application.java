package com.zzs.myblogkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyblogKafka2Application {

    public static void main(String[] args) {
        SpringApplication.run(MyblogKafka2Application.class, args);
    }
}
