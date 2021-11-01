package com.wxm.nacos.gateway.sentinel.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosGatewaySentinelProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGatewaySentinelProviderApplication.class, args);
    }

}
