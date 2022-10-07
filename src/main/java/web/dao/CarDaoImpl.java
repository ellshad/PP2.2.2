package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    List<Car> carList = new ArrayList<>() {
        {
            add(new Car("Peterbit 379", "Optimus prime", 1987));
            add(new Car("Chevrolet Camaro", "Bumblebee", 1967));
            add(new Car("Hummer H2", "Ratchet", 1984));
            add(new Car("Pontiac Solstice GXP", "Jazz", 1989));
            add(new Car("GMC TopKick", "Ironhide", 2006));
        }
    };
    @Override
    public List<Car> getCars() {
        return carList;
    }
}
