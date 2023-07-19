package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> listCar(Integer count) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW", "5", 2022));
        list.add(new Car("lada", "2112", 2007));
        list.add(new Car("AUDI", "7", 2018));
        list.add(new Car("PEUGEOT", "301", 2014));
        list.add(new Car("VW", "POLO", 2021));

        return list.stream().limit(count).collect(Collectors.toList());
    }
}
