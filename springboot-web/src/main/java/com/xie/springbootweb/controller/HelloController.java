package com.xie.springbootweb.controller;

import com.xie.service.admin.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/17 11:45
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello ni hao,wo shi xie shuang heh";
    }
    @RequestMapping("/hello1")
    public String sayHello1(){
        return "hello";
    }
    @RequestMapping("/users")
    public String getUsers(){
        int a = 0;
        int b = 2;
        return a+b+"";
    }
    @RequestMapping("/user/{id}")
    public String getUserById(@PathVariable(value = "id")Byte id){
        return helloService.getUserById(id).toString();
    }
    @RequestMapping("/user")
    public String getUser(){
        return helloService.getUserById((byte) 1).toString();
    }
}
