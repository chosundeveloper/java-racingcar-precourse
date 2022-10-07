package racingcar.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class CarTest {

    @DisplayName("자동차를 생성한다.")
    @Test
    void createCar() {
        assertDoesNotThrow(() -> new Car(new CarName("람보르기니"), new CarPosition()));
    }

}
