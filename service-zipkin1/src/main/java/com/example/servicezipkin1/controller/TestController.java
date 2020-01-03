package com.example.servicezipkin1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String hi(){
        return  "hi我是8081";
    }

    @RequestMapping("/test")
    public String test(){
        return  restTemplate.getForObject("http://localhost:8002/hi",String.class);
    }


}
