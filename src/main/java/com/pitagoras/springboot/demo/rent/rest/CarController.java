package com.pitagoras.springboot.demo.rent.rest;

import com.pitagoras.springboot.demo.rent.dao.CarDAO;
import com.pitagoras.springboot.demo.rent.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private final CarDAO carDAO;

    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }
//    @Autowired
//    public void setMyCar(Car theCar){
//        myCar = theCar;
//    }

    @GetMapping("/save-car")
    public String save() {
        Car car = new Car();
        car.setMake("Bmw");
        car.setModel("M5");
        car.setColor("Black");
        this.carDAO.save(car);
        return "U bought car sucsefully";


    }

    @GetMapping("/find")
    public String findBYId() {

        return this.carDAO.findById(1).toString();


    }


}