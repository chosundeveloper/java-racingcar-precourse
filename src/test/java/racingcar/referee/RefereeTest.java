package racingcar.referee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.car.Car;
import racingcar.car.CarName;
import racingcar.car.CarPosition;
import racingcar.racingcar.RacingCars;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@DisplayName("심판")
class RefereeTest {

    @DisplayName("심판 생성")
    @Test
    void createReferee() {
        RacingCars racingCars = new RacingCars();
        racingCars.add(new Car(new CarName("람보르기니"), new CarPosition()));
        racingCars.add(new Car(new CarName("페라리"), new CarPosition()));
        MovingNumber movingNumber = new MovingNumber(3);
        assertDoesNotThrow(() -> new Referee(racingCars, movingNumber));
    }
}
