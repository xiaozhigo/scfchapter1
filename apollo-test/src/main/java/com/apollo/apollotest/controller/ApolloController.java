package com.apollo.apollotest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApolloController {

    @Value("${apollo-test}")
    private String test;

    @RequestMapping("/apolloTest")
    public String apolloTest(){
        System.out.println(test);
        return test;
    }
}
