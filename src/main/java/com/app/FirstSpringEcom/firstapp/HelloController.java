package com.app.FirstSpringEcom.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 // jackson library responsible for conversion in json...
    @GetMapping("/hello")
    public HelloResponse hello() {
//        return "hello folks!";
        return new HelloResponse("Hello folks this is my first project...");
    }

    @PostMapping("/hello")
    public HelloResponse helloPort(@RequestBody String name) {
        return new HelloResponse("hello folks this is my first project... " + name +", here I am");
    }
}
