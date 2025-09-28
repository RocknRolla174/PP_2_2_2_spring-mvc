package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List<Car> cars = List.of(
            new Car(1, "Model S", "Red"),
            new Car(2, "Model 3", "Black"),
            new Car(3, "Model X", "White"),
            new Car(4, "Model Y", "Blue"),
            new Car(5, "Cybertruck", "Silver")
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}