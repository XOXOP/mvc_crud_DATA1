package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Component
public class Service1 implements Service{
    @Autowired
    Service service;

    static List<Car> cars = new ArrayList<>();

    public Service1() {
        createCars();
    }

    public void createCars() {



        Car car1 = new Car("ZIL", "130", 1962);
        Car car2 = new Car("Lorraine-Dietrich", "CR-2", 1905);
        Car car3 = new Car("RAF", "2203", 1976);
        Car car4 = new Car("Plymout", "Fury", 1957);
        Car car5 = new Car("Plymout", "Superbird", 1970);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getCars(Integer count) {
        List<Car>  cars1 = new ArrayList<>();
        if (count >= 5) {

            cars1 = cars.stream().toList();
        } else if (count < 0) {
            cars1 = null;

        } else cars1 = cars.stream().limit(count).toList();

        return cars1;
    }


}
