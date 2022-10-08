package racingcar.game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.car.Car;
import racingcar.car.CarName;
import racingcar.car.CarPosition;
import racingcar.racingcar.RacingCars;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("게임 컨트롤러")
class GameControllerTest {

    @DisplayName("차수 진행")
    @ParameterizedTest
    @ValueSource(strings = {"2"})
    void createGameController(int number) {
        RacingCars racingCars = new RacingCars();
        racingCars.add(new Car(new CarName("람보르기니"), new CarPosition()));
        racingCars.add(new Car(new CarName("페라리"), new CarPosition()));
        GameController gameController = new GameController(new MovingNumber(number), racingCars);
        gameController.playRound();
        assertThat(gameController.movingNumber()).isEqualTo(new MovingNumber(number - 1));
    }
}
