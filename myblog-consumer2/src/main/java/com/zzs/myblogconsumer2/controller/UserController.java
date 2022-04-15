package com.zzs.myblogconsumer2.controller;

import com.zzs.myblogconsumer2.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        return restTemplate.getForObject("http://myblog-provider/user/getUser/"+id,User.class);
    }
}
