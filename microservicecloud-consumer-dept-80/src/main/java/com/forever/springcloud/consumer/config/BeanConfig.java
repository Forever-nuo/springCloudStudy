package com.forever.springcloud.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.23:03
 */
@Configuration
public class BeanConfig {

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
