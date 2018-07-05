package com.northbrain.demo_module_3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WomanController {

    @GetMapping("/MY")
    public String listing() {
        return null;
    }

}
