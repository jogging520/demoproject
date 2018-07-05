package com.northbrain.demo_module_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/jk")
    public String demo() {
        return "hello, northbrain";
    }
}
