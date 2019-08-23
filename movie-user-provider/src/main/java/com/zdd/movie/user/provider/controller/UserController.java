package com.zdd.movie.user.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/user/{name}")
    public String getUserName(@PathVariable String name){
        return "hello "+name;
    }



}
