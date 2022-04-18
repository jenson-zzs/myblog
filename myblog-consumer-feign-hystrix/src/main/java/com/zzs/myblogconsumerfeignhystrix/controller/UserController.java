package com.zzs.myblogconsumerfeignhystrix.controller;

import com.zzs.myblogconsumerfeignhystrix.domain.User;
import com.zzs.myblogconsumerfeignhystrix.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        return userFeignClient.getUser(id);
    }
}
