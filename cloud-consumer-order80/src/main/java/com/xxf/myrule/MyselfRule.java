package com.xxf.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xxf
 * @create 2021-08-17 10:58
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule(); //定义为随机
    }

}
