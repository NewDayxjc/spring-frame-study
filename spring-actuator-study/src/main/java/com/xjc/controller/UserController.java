package com.xjc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/7/2 10:36
 * @name RestController
 */
@RestController
@RequestMapping("/test")
public class UserController {

    @GetMapping
    public String  test(){
        return "test";
    }
}
