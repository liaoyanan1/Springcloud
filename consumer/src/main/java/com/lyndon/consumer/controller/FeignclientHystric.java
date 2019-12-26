package com.lyndon.consumer.controller;

import org.springframework.stereotype.Component;

@Component
public class FeignclientHystric implements   Feignclient {


    @Override
    public  String test(){
        return "error1";
    };
}
