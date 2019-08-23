package com.zdd.movie.feign.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignClientFallBack implements UserFeignClient{
    @Override
    public String getUserName(String name) {
        return "你猜？";
    }
}
