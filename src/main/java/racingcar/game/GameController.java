package racingcar.game;

import racingcar.racingcar.RacingCars;

public class GameController {
    private MovingNumber movingNumber;

    private final RacingCars racingCars;
    public GameController(MovingNumber movingNumber, RacingCars racingCars) {
        this.movingNumber = movingNumber;
        this.racingCars = racingCars;
    }

    public void playRound() {
        this.racingCars.move();
        this.movingNumber = movingNumber.subtract();
    }

    public MovingNumber movingNumber() {
        return this.movingNumber;
    }

    public void play() {
        do {
            playRound();
        } while (!isMovingNumberZero());
    }

    private boolean isMovingNumberZero() {
        return this.movingNumber.equals(new MovingNumber(0));
    }
}
