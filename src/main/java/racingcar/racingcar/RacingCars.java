package racingcar.racingcar;

import camp.nextstep.edu.missionutils.Randoms;
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

    public void move() {
        for (Car car : cars) {
            car.move(Randoms.pickNumberInRange(0, 9));
        }
    }

}
