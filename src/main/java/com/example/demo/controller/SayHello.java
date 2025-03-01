package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SayHello {
    //curl localHost:8080/hello-w "\n"
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello From Kushagra";
    }

    //curl localhost:8080/hello/query?name=Kushagra -w "\n"
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
        public  String SayHello(@RequestParam(value = "name")String name) {
        return "Hello " + name + "!";
    }


}

































