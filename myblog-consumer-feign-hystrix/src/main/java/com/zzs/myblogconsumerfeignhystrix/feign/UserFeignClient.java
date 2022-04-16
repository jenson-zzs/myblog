package com.zzs.myblogconsumerfeignhystrix.feign;

import com.zzs.myblogconsumerfeignhystrix.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "myblog-provider", fallback = HystrixClientFallback.class)
@FeignClient(name = "myblog-provider", fallbackFactory = HystrixClientFactory.class)
public interface UserFeignClient {

    @GetMapping (value = "/user/getUser/{id}")
    public User getUser(@PathVariable("id") Long id);
}
