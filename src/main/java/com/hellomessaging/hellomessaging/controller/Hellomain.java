package com.hellomessaging.hellomessaging.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Hellomain {
    //    @RequestMapping(value = {"","/","/hello"})
    @GetMapping("/hello")
    public String printhello(){
        return "Hello from BridgeLabz";
    }

}
