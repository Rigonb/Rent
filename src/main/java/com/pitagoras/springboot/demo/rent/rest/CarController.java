package com.pitagoras.springboot.demo.rent.rest;

import com.pitagoras.springboot.demo.rent.dao.CarDAO;
import com.pitagoras.springboot.demo.rent.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/update-car")
    public String updateCar() {
        Car car = this.carDAO.findById(2);

        if (car == null) {
            return "Not found";
        }

        car.setMake("Bmw");
        car.setModel("M550i");
        car.setColor("Black");
        car.setYear(2022);
        car.setAvailable(true);
        car.setLicensePlate("01-221-DV");
        carDAO.updateCar(car);
        return "U updated the  car sucsefully";


    }

    @GetMapping("/delete-car")
    public String deleteCar() {
        Car car = this.carDAO.findById(2);

        if (car == null) {
            return "Car not found";
        }
        carDAO.deleteCar(car);
        return "U deleted the car";


    }

    @GetMapping("/list-cars")
    public String findAllCars() {
        List<Car> cars = this.carDAO.findAllCars();
        String response = ",";
        for (Car car : cars) {
            response += car.toString() + "\n";
        }
        return response;

    }

}