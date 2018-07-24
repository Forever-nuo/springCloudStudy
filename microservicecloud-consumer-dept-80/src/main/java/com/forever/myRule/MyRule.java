package com.forever.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Forever丶诺
 * @createTime: 2018-7-24.22:37
 */
@Configuration
public class MyRule {

    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
