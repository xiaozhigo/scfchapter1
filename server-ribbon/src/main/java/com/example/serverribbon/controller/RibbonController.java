package com.example.serverribbon.controller;

import com.example.serverribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wulei
 * @date 2019-01-18 15:39
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/port")
    public String port(){
        return ribbonService.port();
    }
}
