package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

// Custom User class for receiving the POST data
class User {
    private String firstName;
    private String lastName;

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

@RestController
@RequestMapping("/hello")
public class SayHelloName {

    // curl localhost:8080/hello or localhost:8080/hello/home -w "\n"
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From Kushagra";
    }

    // curl localhost:8080/hello/query?name=Kushagra -w "\n"
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    // curl localhost:8080/hello/param/Kushagra -w "\n"
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // curl -X POST -H "Content-Type: application/json" -d '{"firstName": "Kushagra", "lastName": "Dixit"}' http://localhost:8080/hello/post -w "\n"
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }
}
