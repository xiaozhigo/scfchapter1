package com.example.serverzipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wulei
 * @date 2019-01-21 14:50
 */
@RestController
public class ServerZipkinController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/callHome")
    public String callHome(){
          return restTemplate.getForObject("http://localhost:7009/callHome",String.class);
    }

    @RequestMapping("/info")
    public String info(){
        return "i am server-zipkin";
    }
}
