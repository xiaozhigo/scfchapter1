package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wulei
 * @date 2019-01-21 10:37
 */
@RestController
public class ConfigClientController {

      @Value("${foo}")
      private String foo;

      @RequestMapping("/foo")
      public String foo(){
          return foo;
      }
}
