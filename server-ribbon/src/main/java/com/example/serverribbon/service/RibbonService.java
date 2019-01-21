package com.example.serverribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wulei
 * @date 2019-01-18 15:47
 */
@Service
public class RibbonService {

   @Autowired
   RestTemplate restTemplate;

   @HystrixCommand(fallbackMethod = "portError")
    public String port() {
        return restTemplate.getForObject("http://eureka-client/port",String.class);
    }

    public String portError(){
       return "请求有误";
    }
}
