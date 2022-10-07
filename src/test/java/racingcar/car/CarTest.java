package racingcar.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class CarTest {

    @DisplayName("자동차를 생성한다.")
    @Test
    void createCar() {
        assertDoesNotThrow(() -> new Car(new CarName("람보르기니"), new CarPosition()));
    }

    @DisplayName("자동차는 이동한다.")
    @ParameterizedTest
    @ValueSource(strings = {"4", "9"})
    void createCarPosition(int number) {
        Car car = new Car(new CarName("람보르기니"), new CarPosition());
        car.move(number);
        assertThat(car.carPosition()).isEqualTo(new CarPosition(1));
    }

}
