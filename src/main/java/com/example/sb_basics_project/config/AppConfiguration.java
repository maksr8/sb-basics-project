package com.example.sb_basics_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
class AppConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        //possible conf
        return new RestTemplate();
    }
}
