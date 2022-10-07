package racingcar.racingcar;

import racingcar.car.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        this.cars.add(car);
    }

    public int size() {
        return this.cars.size();
    }

}
