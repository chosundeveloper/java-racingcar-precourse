package racingcar.referee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("이동 횟수")
class MovingNumberTest {

    @DisplayName("이동 횟수 생성")
    @ParameterizedTest
    @ValueSource(strings = "3")
    void createMovingNumber(int number) {
        MovingNumber movingNumber = new MovingNumber(number);
        assertThat(movingNumber).isEqualTo(new MovingNumber(number));
    }

}
