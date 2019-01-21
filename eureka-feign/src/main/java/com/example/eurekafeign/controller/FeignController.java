package com.example.eurekafeign.controller;

import com.example.eurekafeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wulei
 * @date 2019-01-18 16:13
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/port")
    public String port(){
        return feignService.port();
    }
}
