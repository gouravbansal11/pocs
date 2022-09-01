package com.zebra.poc.clientms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {

    @GetMapping(value = "/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello "+ name;
    }

    @GetMapping(value = "/sayHello")
    public String sayHello(){
        return "Hello ";
    }
}
