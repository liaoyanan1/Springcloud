package com.example.servicezipkin1;


import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceZipkin1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceZipkin1Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
