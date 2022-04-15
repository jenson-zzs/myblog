package com.zzs.myblogconsumer.controller;

import com.zzs.myblogconsumer.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
//    private static Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        return restTemplate.getForObject("http://myblog-provider/user/getUser/"+id,User.class);
    }
}
