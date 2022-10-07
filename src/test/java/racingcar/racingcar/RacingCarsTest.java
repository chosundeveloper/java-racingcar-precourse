package racingcar.racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.car.Car;
import racingcar.car.CarName;
import racingcar.car.CarPosition;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("경주 자동차")
class RacingCarsTest {

    @Test
    void createReferee() {
        RacingCars racingCars = new RacingCars();
        racingCars.add(new Car(new CarName("람보르기니"), new CarPosition()));
        racingCars.add(new Car(new CarName("페라리"), new CarPosition()));
        assertThat(racingCars.size()).isEqualTo(2);
    }

}
