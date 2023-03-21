package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class CarServiceImpl implements CarService{

    private final List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("Car1", 1, 2011),
            new Car("Car2", 2, 2012),
            new Car("Car3", 3, 2013),
            new Car("Car4", 4, 2014),
            new Car("Car5", 5, 2015)
    ));

    @Override
    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return cars;
        } else if (count < 0) {
            return new ArrayList<>();
        }
        return cars.subList(0, count);
    }
}
