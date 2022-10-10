package racingcar.referee.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.car.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        validate(car);
        this.cars.add(car);
    }

    private void validate(Car addCar) {
        for (Car car : this.cars) {
            if (addCar.carName().equals(car.carName())) {
                System.out.println("[ERROR] 같은 이름의 자동차를 추가할 수 없습니다.");
                System.out.println();
                throw new IllegalArgumentException("[ERROR] 같은 이름의 자동차를 추가할 수 없습니다.");
            }
        }
    }

    public int size() {
        return this.cars.size();
    }

    public List<Car> cars() {
        return this.cars;
    }

    public void move() {
        for (Car car : cars) {
            car.move(Randoms.pickNumberInRange(0, 9));
        }
    }

}
