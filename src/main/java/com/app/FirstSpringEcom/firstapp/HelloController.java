package com.app.FirstSpringEcom.firstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello folks!";
    }

    @PostMapping("/hello")
    public String helloPort(@RequestBody String name) {
        return "hello " + name + "!";
    }
}
