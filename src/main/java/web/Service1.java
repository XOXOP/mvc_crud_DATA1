package web;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class Service1 {
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




//    public static List<Car> getCars(int count) {
//        if (count == 0) {
//            return cars;

        public static List<Car> getCars(Integer count) {
            int tmp = (count != null) ? count : 5;
            return cars.subList(0, tmp);
        }


      // return cars.stream().limit(count).collect(Collectors.toList());

}