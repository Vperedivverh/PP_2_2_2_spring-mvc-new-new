package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private final CarServiceImpl service;

    public CarController(CarServiceImpl service)  {
        this.service = service;
    }

    @GetMapping()
    public String AllCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        if (count < 0) {
            System.out.println("Ne nado tak delat! zapros<0");
            model.addAttribute("err", "ВВЕДИТЕ ПОЛОЖИТЕЛЬНОЕ ЗНАЧЕНИЕ!");
            return "cars";
        } else {
            List<Car> list = service.list(count);
            model.addAttribute("cars", list);
            return "cars";
        }
    }
}
