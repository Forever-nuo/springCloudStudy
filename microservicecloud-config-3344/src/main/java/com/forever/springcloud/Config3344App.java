package com.forever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-26.23:53
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344App {

    public static void main(String[] args) {
        SpringApplication.run(Config3344App.class, args);
    }
}
