package com.forever.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.21:19
 */
@MapperScan("com.forever.springcloud.mapper")
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderDept8001App {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderDept8001App.class, args);
    }
}
