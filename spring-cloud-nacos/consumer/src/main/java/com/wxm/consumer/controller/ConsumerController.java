package com.wxm.consumer.controller;

import com.wxm.consumer.feign.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>写一个contro 调用对应feign client  接口中的方法</p>
 * <p></p>
 *
 * @author 王森明
 * @date 2021/11/1 13:17
 * @since 1.0.0
 */
@RequestMapping("api")
@RestController
public class ConsumerController {
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private ProviderFeignClient providerFeignClient;

    @GetMapping("/showMsg")
    private String getMsg(@RequestParam(value="name",required = false) String name){
        return providerFeignClient.getMsg(name)+", The current access comes from a consumer with port number "+serverPort;
    }
}
