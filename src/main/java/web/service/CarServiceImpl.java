package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();

    public List<Car> getCarByCount(int count) {
        return carDao.getCars().stream().limit(count).collect(Collectors.toList());
    }
}