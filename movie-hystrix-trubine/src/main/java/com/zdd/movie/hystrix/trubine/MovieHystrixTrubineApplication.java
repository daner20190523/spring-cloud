package com.zdd.movie.hystrix.trubine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
public class MovieHystrixTrubineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieHystrixTrubineApplication.class, args);
    }

}
