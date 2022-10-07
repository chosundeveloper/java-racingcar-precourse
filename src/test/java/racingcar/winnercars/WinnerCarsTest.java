package racingcar.winnercars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.car.Car;
import racingcar.car.CarName;
import racingcar.car.CarPosition;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("우승 자동차")
class WinnerCarsTest {

    @DisplayName("우승 자동차 생성")
    @Test
    void createWinnerCars() {
        Car lamborghini = new Car(new CarName("람보르기니"), new CarPosition());
        WinnerCars winnerCars = new WinnerCars();
        assertDoesNotThrow(() -> winnerCars.add(lamborghini));
    }
}
