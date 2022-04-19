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
//相比于MyblogConsumer，添加@RibbonClient，可以选择自己想要的负载均衡算法。但相同的是，都要加上@LoadBalanced
@RibbonClient(name = "myblog-provider", configuration = com.zzs.config.LoadBalanced.class)
public class MyblogConsumer2Application {
    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(MyblogConsumer2Application.class, args);
    }

}
