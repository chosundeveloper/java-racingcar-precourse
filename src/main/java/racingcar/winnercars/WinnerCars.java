package racingcar.winnercars;

import racingcar.car.Car;

import java.util.ArrayList;
import java.util.List;

public class WinnerCars {

    private List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        this.cars.add(car);
    }
}
