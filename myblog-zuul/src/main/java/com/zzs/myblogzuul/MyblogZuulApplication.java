package com.zzs.myblogzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MyblogZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogZuulApplication.class, args);
    }

}
