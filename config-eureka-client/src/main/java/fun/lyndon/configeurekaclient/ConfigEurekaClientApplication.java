package fun.lyndon.configeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@EnableEurekaClient
@SpringBootApplication
public class ConfigEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaClientApplication.class, args);
    }

    @Value("${foo}")
    String s;

    @RequestMapping("/test")
    public String test(){
        return  s;
    }

}
