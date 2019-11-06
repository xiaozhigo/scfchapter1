package com.example.eurekaclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(ClientController.class);

    @Value("${server.port}")
    private String port;

    @RequestMapping("/port")
    public String port(){
        logger.info("进入port接口");
        return "port:"+port+"正在启动中";
    }


    @RequestMapping("/home")
    //@HystrixCommand(fallbackMethod = "homeError")
    public String home(@RequestParam String name){
        return "welcome to home "+name+",port:"+port;
    }

    public String homeError(String name){
        return "sorry "+name+" i can't help you";
    }
}
