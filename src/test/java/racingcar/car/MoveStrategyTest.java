package racingcar.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import racingcar.car.domain.Car;
import racingcar.car.domain.CarName;
import racingcar.car.domain.CarPosition;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("이동 전략")
class MoveStrategyTest {
    @ParameterizedTest
    @CsvSource(value = {"4,true", "3,false", "5,true"})
    void isMove(int input, boolean isMove) {
        Car car = new Car(new CarName("람보르기니"), new CarPosition());
        assertThat(car.movable(input)).isEqualTo(isMove);
    }
}
