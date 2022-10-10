package racingcar.game;

import racingcar.car.domain.Car;
import racingcar.car.domain.CarPosition;
import racingcar.referee.domain.MovingNumber;
import racingcar.referee.domain.RacingCars;
import racingcar.referee.domain.WinningCars;

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

    public WinningCars winningCars() {
        WinningCars winningCars = new WinningCars();
        for (Car car : this.racingCars.cars()) {
            if (car.carPosition().equals(maxPosition())) {
                winningCars.add(car);
            }
        }
        return winningCars;
    }

    private CarPosition maxPosition() {
        CarPosition maxPosition = new CarPosition();
        for (Car car : this.racingCars.cars()) {
            if (maxPosition.compareTo(car.carPosition()) < 0) {
                maxPosition = car.carPosition();
            }
        }
        return maxPosition;
    }

}
