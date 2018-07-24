package com.forever.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-19.21:19
 */
@MapperScan("com.forever.springcloud.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudProviderDept8002App {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderDept8002App.class, args);
    }
}
