package com.example.hystrixdashboardclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableHystrix
@RestController
public class HystrixdashboardClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixdashboardClientApplication.class, args);
    }

    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping("/test")
    public String test(){
        return "123";
    }

    private String error(){
        return "error";
    }
}
