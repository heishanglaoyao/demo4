package com.example.demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by chentuo on 2018/6/12.
 */
@RestController
class IndexController {

    @RequestMapping("/index")
    String index(){
        "Hellow !"
    }
}
