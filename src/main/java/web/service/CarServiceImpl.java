package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarsDao;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Autowired
    private CarsDao carsDao;
    @Override
    public List<Car> list(int count) {
        List<Car> list = carsDao.getList();
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
