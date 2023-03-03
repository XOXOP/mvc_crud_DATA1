package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public interface Service {

    void createCars();

    List<Car> getCars(Integer count);
}