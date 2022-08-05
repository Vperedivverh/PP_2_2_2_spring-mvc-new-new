package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    public List<Car> list(int count) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("1", "11",111 ));
        list.add(new Car("2", "22", 222));
        list.add(new Car("3", "33", 333));
        list.add(new Car("4", "44", 444));
        list.add(new Car("5", "55", 555));

        return list.stream().limit(count).collect(Collectors.toList());
    }
}
