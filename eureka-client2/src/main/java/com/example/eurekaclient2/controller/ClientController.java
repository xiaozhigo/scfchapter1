package com.example.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
