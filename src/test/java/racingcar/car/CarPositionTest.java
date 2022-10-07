package racingcar.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("자동차 위치")
class CarPositionTest {

    @DisplayName("자동차 위치의 초기값은 0이다.")
    @Test
    void createCarPosition() {
        CarPosition carPosition = new CarPosition();
        assertThat(carPosition).isEqualTo(new CarPosition(0));
    }

}
