package com.zzs.myblogprovider.controller;

import com.zzs.myblogprovider.domain.LoginVo;
import com.zzs.myblogprovider.domain.User;
import com.zzs.myblogprovider.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private LoginService loginService;

    @GetMapping(value = "/getUser/{id}")
    public User getUser(@PathVariable Long id){
        User user=new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(18);
        return user;
    }
    @GetMapping(value = "/getName")
    public String getName(){
        return "张三";
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public String login(@RequestBody LoginVo loginVo){
        return loginService.login(loginVo);
    }
}