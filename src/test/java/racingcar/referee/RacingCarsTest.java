package racingcar.referee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.car.domain.Car;
import racingcar.car.domain.CarName;
import racingcar.car.domain.CarPosition;
import racingcar.referee.domain.RacingCars;

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
