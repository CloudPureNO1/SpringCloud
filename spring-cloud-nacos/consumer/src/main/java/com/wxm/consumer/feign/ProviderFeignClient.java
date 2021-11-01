package com.wxm.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>写一个FeignClient，去调用provider服务的接口：</p>
 * <p></p>
 *
 * @author 王森明
 * @date 2021/11/1 13:14
 * @since 1.0.0
 */
@FeignClient(value = "provider")
public interface ProviderFeignClient {
    /**
     * /provider/getMsg  这里的路径等于  provider 端 对应接口的全地址  http://localhost:7771/provider/getMsg?name=wangsm
     * @param name
     * @return
     */
    @GetMapping("/provider/getMsg")
    String getMsg(@RequestParam(value="name",required = false) String name);
}
