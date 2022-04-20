package com.zzs.myblogeurekasever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyBlogEurekaHighApplication// extends SpringBootServletInitializer
{

    public static void main(String[] args) {
        SpringApplication.run(MyBlogEurekaHighApplication.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(MyBlogEurekaHighApplication.class);
//    }
}
