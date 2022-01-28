package com.wxm.provider.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 * <p></p>
 *
 * @author 王森明
 * @date 2022/1/28 13:22
 * @since 1.0.0
 */
@RestController
@RequestMapping("/config")
@RefreshScope  //写一个RestController,在Controller上添加 @RefreshScope 实现配置的热加载
public class ProviderConfigController {
    @Value(value="${server.port}")
    private String serverPort;

    @GetMapping("/getMsg")
    public String getMsg(@RequestParam(value="name",required = false,defaultValue = "王森明")String name){
        return  name+",Welcome! I'm provider,my port is "+serverPort;
    }


    @Value("${name}")
    private String name;
    @GetMapping("/getName")
    public String getName(){
        return "name is :"+name+",Welcome! I'm provider,my port is "+serverPort;
    }
}
