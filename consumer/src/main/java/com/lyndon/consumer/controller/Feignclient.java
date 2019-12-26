package com.lyndon.consumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* @Author lyn
 * @Description //TODO feign方式的调用服务 value服务名 fallback 熔断后访问方法
 * @Date 2019/12/26 11:52
**/
@FeignClient(value ="eureka-provider",fallback = FeignclientHystric.class)
public interface Feignclient {

    @RequestMapping(value = "test" ,method = RequestMethod.GET)
    String test();
}
