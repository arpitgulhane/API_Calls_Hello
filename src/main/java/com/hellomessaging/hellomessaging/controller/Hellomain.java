package com.hellomessaging.hellomessaging.controller;

import com.hellomessaging.hellomessaging.entity.Hello;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hellomain {
    //    @RequestMapping(value = {"","/","/hello"})
    @GetMapping("/hello")
    public String printhello(){
        return "Hello from BridgeLabz";
    }

//    @RequestMapping(value = {"/parameter"},method = RequestMethod.GET)
    @GetMapping("/parameter")
    public String parameterRequest(@RequestParam String name){
        return "Hello  "+ name +" from BridgeLabz" ;
    }
    @GetMapping("variable/{name}")
    public String variableRequest(@PathVariable String name){
        return "Hello  "+ name +" from BridgeLabz";
    }
    @PostMapping("/post")
    public String postRequest(@RequestBody Hello hello){
        return "Hello  "+ hello.getName() +hello.getLastName();
    }

    @PutMapping("/put/{name}")
    public String putRequest(@PathVariable String name , @RequestParam (value="lastname") String lastname) {
        return name+" "+lastname;
    }




}
