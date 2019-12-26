package com.lyndon.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
/* @Author lyn
 * @Description //TODO 测试
 * @Date 2019/12/26 11:54
**/
@RestController
public class Controller {

    @Resource
    RestTemplate restTemplate;

    @Resource
    Feignclient feignclient;



    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("/test")
    public String test(){
        return  restTemplate.getForObject("http://eureka-provider/test",String.class);
    }

    @GetMapping("/test1")
    public String test1(){
        return  feignclient.test();
    }

    public String error(){
        return "error";
    }
}
