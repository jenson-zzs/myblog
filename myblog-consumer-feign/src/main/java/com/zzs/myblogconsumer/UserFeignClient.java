package com.zzs.myblogconsumer;

import com.zzs.config.Configuration;
import com.zzs.myblogconsumer.domain.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient("myblog-provider") //有默认使用负载均衡的算法
@FeignClient(value = "myblog-provider",configuration = Configuration.class)//指定使用想要的负载均衡的算法
public interface UserFeignClient {

//    @GetMapping(value = "/user/getUser/{id}")
//    public User getUser(@PathVariable("id")Long id);

    @RequestLine("GET /user/getUser/{id}")
    public User getUser(@Param("id") Long id);
}