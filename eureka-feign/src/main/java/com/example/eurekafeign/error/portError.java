package com.example.eurekafeign.error;

import com.example.eurekafeign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @author wulei
 * @date 2019-01-18 16:43
 */
@Component
public class portError implements FeignService {
    @Override
    public String port() {
        return "请求出错";
    }
}
