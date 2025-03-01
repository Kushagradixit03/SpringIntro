package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloMessage {
    //curl localHost:8080/hello-w "\n"
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello From Kushagra";
    }

}

































