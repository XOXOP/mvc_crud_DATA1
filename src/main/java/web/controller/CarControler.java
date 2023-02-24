package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import web.Service1;
import web.Car;

import javax.servlet.http.HttpServletRequest;


@Controller
public class CarControler {

    @Autowired
    Service1 service;



    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") Integer count,
                         Model model) {
        List<Car> cars = service.getCars(count);
        model.addAttribute("cars", Service1.getCars(count));

        return "cars";
    }
}



