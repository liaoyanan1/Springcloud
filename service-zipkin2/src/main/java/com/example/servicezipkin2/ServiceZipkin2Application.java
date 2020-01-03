package com.example.servicezipkin2;


import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceZipkin2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZipkin2Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

//持续更新信息
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
