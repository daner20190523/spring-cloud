package com.zdd.movie.trace.zipkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String helloZipkin(){
        return "hello zipkin";
    }
}
