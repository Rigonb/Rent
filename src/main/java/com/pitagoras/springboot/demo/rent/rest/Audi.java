package com.pitagoras.springboot.demo.rent.rest;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Audi implements Car {


    public Car audi() {
        System.out.println("Constructor: " + getClass().getName());
        return new Audi();
    }


    @Override
    public String Drive() {
        return "Audi is the slowest";
    }
}
