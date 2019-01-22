package com.example.eurekaclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wulei
 * @date 2019-01-18 15:01
 */
@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/port")
    public String port(){
        return "port:"+port+"正在启动中";
    }


    @RequestMapping("/home")
    @HystrixCommand(fallbackMethod = "homeError")
    public String home(@RequestParam String name){
        return "welcome to home "+name+",port:"+port;
    }

    public String homeError(String name){
        return "sorry "+name+" i can't help you";
    }
}
