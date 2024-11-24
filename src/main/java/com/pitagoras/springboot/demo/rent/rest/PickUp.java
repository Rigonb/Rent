package com.pitagoras.springboot.demo.rent.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class PickUp implements Car {

    public PickUp() {
        System.out.println("Constructor: " + getClass().getName());
    }


    @Override
    public String Drive() {
        return "Pickupi 1000+";
    }
}