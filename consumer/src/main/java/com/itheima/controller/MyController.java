package com.itheima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.service.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")

public class MyController {

   @Reference
    Hello hello;

    @RequestMapping("/fun")
    @ResponseBody
    public String hello() {
        String f = hello.fun ( "张san" );
        System.out.println ( f );
        return f;
    }

}
