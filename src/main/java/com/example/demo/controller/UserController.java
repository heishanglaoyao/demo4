package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chentuo on 2018/6/12.
 */
@RestController
public class UserController {


    @RequestMapping("/user")
    public String text(){
        return "UserController";
    }
}
