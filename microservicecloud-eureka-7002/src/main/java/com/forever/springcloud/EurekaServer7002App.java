package com.forever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-20.21:04
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002App.class, args);
    }
}
