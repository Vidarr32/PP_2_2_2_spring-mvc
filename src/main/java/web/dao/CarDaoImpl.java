package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class CarDaoImpl implements CarDao{
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
        }
        return cars.subList(0, count);
    }
}
