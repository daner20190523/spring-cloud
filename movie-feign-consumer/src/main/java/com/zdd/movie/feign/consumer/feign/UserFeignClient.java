package com.zdd.movie.feign.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "movie-user-provider",fallback = FeignClientFallBack.class)
public interface UserFeignClient {

    @RequestMapping(value = "/user/{name}",method = RequestMethod.GET)
    public String getUserName(@PathVariable(value = "name") String name);
}
