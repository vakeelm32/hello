package com.test.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "Hello World " + new Date().toString();
    }
}
