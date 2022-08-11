package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarsDaoImpl implements CarsDao {
   private List<Car> list = new ArrayList<>();

    {
        list.add(new Car("1", "11", 111));
        list.add(new Car("2", "22", 222));
        list.add(new Car("3", "33", 333));
        list.add(new Car("4", "44", 444));
        list.add(new Car("5", "55", 555));
    }
@Override
    public List<Car> getList() {
        return list;
    }
}
