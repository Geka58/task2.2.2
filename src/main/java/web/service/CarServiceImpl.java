package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car("BMW", "5", 2022));
        carList.add(new Car("lada", "2112", 2007));
        carList.add(new Car("AUDI", "7", 2018));
        carList.add(new Car("PEUGEOT", "301", 2014));
        carList.add(new Car("VW", "POLO", 2021));
    }

    @Override
    public List<Car> listCar(Integer count) {
        if (count <= carList.size() && count >= 0) {
            return carList.stream().limit(count).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}
