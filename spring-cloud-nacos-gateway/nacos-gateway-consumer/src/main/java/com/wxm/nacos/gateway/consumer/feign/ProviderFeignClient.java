package com.wxm.nacos.gateway.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p></p>
 * <p></p>
 *
 * @author 王森明
 * @date 2021/11/1 15:04
 * @since 1.0.0
 */
@FeignClient(value="provider")
public interface ProviderFeignClient {
    /**
     * 需要对应服务提供者的访问权路径/provider/getMsg
     * @param name
     * @return
     */
    @GetMapping("/provider/getMsg")
    String getMsg(@RequestParam("name")String name);
}
