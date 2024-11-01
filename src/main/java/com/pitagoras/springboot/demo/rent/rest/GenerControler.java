package com.pitagoras.springboot.demo.rent.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerControler {

    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }
    @GetMapping("/about")
    public String tellAbtApp(){
        return "In this application were creating for learnin porpuses";
    }





}
