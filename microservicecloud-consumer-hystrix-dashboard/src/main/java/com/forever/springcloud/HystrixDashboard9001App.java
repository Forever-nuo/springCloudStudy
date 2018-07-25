package com.forever.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-25.23:20
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001App {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001App.class, args);
    }
}



