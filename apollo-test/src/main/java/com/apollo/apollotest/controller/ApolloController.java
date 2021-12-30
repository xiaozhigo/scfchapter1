package com.apollo.apollotest.controller;

import com.apollo.apollotest.service.ApolloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloController {

    @Value("${apollo-public}")
    private String test;
    @Autowired
    private ApolloService apolloService;

    @RequestMapping("/apolloTest")
    public String apolloTest(){
        System.out.println(test);
        return test;
    }

    @RequestMapping("/queryAllUser")
    public String queryAllUser(){
        return apolloService.getNowTime();
    }
}
