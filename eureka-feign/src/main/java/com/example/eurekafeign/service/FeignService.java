package com.example.eurekafeign.service;

import com.example.eurekafeign.error.portError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wulei
 * @date 2019-01-18 16:16
 */
@FeignClient(value = "eureka-client",fallback = portError.class)
public interface FeignService {

    @RequestMapping("/port")
    String port();
}
