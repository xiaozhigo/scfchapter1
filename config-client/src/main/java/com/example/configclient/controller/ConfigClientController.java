package com.example.configclient.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wulei
 * @date 2019-01-21 10:37
 */
@Api(description = "端口测试")
@RestController
public class ConfigClientController {

      @Value("${foo}")
      private String foo;

      @ApiOperation(value = "获取yml文件中的信息",notes = "无")
      @RequestMapping("/foo")
      public String foo(){
          return foo;
      }
}
