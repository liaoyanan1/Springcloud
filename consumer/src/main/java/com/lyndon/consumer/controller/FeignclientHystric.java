package com.lyndon.consumer.controller;

import org.springframework.stereotype.Component;
/* @Author lyn
 * @Description //TODO 熔断后的方法
 * @Date 2019/12/26 11:53
**/
@Component
public class FeignclientHystric implements   Feignclient {


    @Override
    public  String test(){
        return "error1";
    };
}
