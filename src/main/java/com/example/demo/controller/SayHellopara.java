package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class SayHellopara {
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

    //curl localhost:8080/hello/param/Kushagra -w "\n"
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return  "Hello " + name + "!";
    }


}

































