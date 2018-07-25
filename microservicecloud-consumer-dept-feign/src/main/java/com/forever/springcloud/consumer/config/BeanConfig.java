package com.forever.springcloud.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }


    /**
     * 会覆盖默认的轮询算法
     * @return
     */
    @Bean
    public IRule iRule(){
        return  new RandomRule();
    }
}
