package com.zzs.myblogkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyblogKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogKafkaApplication.class, args);
    }
}
