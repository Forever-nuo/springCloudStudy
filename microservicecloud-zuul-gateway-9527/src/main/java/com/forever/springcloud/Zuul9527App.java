package com.forever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-26.21:38
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527App {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527App.class, args);
    }
}
