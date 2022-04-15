package com.zzs.myblogconsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MYBLOG-PROVIDER", configuration = com.zzs.config.LoadBalanced.class)
public class MyblogConsumer2Application {
    @Bean
//    @LoadBalanced//开启负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(MyblogConsumer2Application.class, args);
    }

}
