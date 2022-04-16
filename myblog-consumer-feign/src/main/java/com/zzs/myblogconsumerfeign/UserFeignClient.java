package com.zzs.myblogconsumerfeign;

import com.zzs.config.Configuration;
import com.zzs.myblogconsumerfeign.domain.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

//@FeignClient("myblog-provider")
@FeignClient(value = "myblog-provider",configuration = Configuration.class)//指定使用想要的契约
public interface UserFeignClient {

//    @GetMapping(value = "/user/getUser/{id}")
//    public User getUser(@PathVariable("id")Long id);

    @RequestLine("GET /user/getUser/{id}")
    public User getUser(@Param("id") Long id);
}