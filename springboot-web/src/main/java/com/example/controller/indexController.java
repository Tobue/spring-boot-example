package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiesguo
 * @Date: 2019/9/13/013 16:22
 */
@RestController
public class indexController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "test success  dgfd gd我们";
    }

}
