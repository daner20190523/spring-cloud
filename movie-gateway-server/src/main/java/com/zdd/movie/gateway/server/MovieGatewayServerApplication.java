package com.zdd.movie.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieGatewayServerApplication{

    public static void main(String[] args) {
        SpringApplication.run(MovieGatewayServerApplication.class, args);
    }

}
