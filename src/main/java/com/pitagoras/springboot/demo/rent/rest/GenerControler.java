package com.pitagoras.springboot.demo.rent.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenerControler {
   @Value("${brand.name}")
 private String brandame;

   @Value("${motor.type}")
   private String motorType;

    @GetMapping("/cartype")
   public String sayHello(){
     return "Hello u , my car name is " + this.brandame + "and my motor type is " + motorType +" petrol";
    }

    @GetMapping("/about")
    public String tellAbtApp(){
        return "This application were creating for learnin porpuses";
    }

    @GetMapping("/second")
    public String  secondOne(){
        return "Auto re run function on ide added";
    }

    @GetMapping("/third")
    public String  thirdone(){
        return "Auto re run function on ide added aaaaa something else";
    }

}
