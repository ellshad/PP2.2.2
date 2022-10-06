package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    List<Car> carList = new ArrayList<>() {
        {
            add(new Car("Peterbit 379", "Optimus prime", 1987));
            add(new Car("Chevrolet Camaro", "Bumblebee", 1967));
            add(new Car("Hummer H2", "Ratchet", 1984));
            add(new Car("Pontiac Solstice GXP", "Jazz", 1989));
            add(new Car("GMC TopKick", "Ironhide", 2006));
        }
    };

    public List<Car> getCarByCount(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}