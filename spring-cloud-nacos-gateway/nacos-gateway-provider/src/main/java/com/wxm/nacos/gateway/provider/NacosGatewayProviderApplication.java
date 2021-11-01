package com.wxm.nacos.gateway.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosGatewayProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosGatewayProviderApplication.class, args);
    }

}
