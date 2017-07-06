package com.keithwang.demo.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class MyApplication {

	public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
