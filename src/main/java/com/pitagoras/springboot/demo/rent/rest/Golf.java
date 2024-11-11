package com.pitagoras.springboot.demo.rent.rest;

import org.springframework.stereotype.Component;

@Component
public class Golf implements Car {
    @Override
    public String Drive() {
        return "Driving Golf 200 km/h";
    }
}
