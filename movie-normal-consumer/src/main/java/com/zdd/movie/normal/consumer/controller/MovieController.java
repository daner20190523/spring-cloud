package com.zdd.movie.normal.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user/{name}")
    public String getUserName(@PathVariable String name){
        return restTemplate.getForObject("http://127.0.0.1:8001/user/"+name,String.class);
    }
}
