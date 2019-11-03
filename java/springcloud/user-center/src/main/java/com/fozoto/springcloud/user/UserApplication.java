package com.fozoto.springcloud.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author qingyan on 2019-11-03
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.fozoto.springcloud.user")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
