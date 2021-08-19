package com.xxf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xxf
 * @create 2021-08-17 9:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain8002.class,args);
    }
}
