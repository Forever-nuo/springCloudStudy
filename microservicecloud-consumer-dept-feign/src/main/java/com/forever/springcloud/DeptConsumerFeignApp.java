package com.forever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.23:08
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.forever.springcloud")
@ComponentScan("com.forever.springcloud")
public class DeptConsumerFeignApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApp.class, args);
    }
}
