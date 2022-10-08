package racingcar.referee;

import racingcar.game.MovingNumber;
import racingcar.racingcar.RacingCars;

public class Referee {

    private final RacingCars racingCars;
    private final MovingNumber movingNumber;

    public Referee(RacingCars racingCars, MovingNumber movingNumber) {
        this.racingCars = racingCars;
        this.movingNumber = movingNumber;
    }

}
