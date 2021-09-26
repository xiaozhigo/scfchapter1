package com.apollo.apollotest;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableApolloConfig
public class ApolloTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloTestApplication.class, args);
    }

}
