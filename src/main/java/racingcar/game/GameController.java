package racingcar.game;

import racingcar.car.domain.Car;
import racingcar.car.domain.CarName;
import racingcar.car.domain.CarPosition;
import racingcar.referee.domain.MovingNumber;
import racingcar.referee.domain.RacingCars;
import racingcar.referee.domain.Referee;

import static racingcar.car.ui.InputCarNames.readCarNames;
import static racingcar.referee.ui.InputMovingNumber.readMovingNumber;

public class GameController {

    public void run() {
        RacingCars racingCars = createRacingCars();
        Referee referee = new Referee(racingCars, createMovingNumber());
        referee.playAllRound();
    }

    public RacingCars createRacingCars() {
        RacingCars racingCars = new RacingCars();
        try {
            return addRacingCars(racingCars);
        } catch (IllegalArgumentException e) {
            return createRacingCars();
        }
    }

    private RacingCars addRacingCars(RacingCars racingCars) {
        for (String name : readCarNames()) {
            racingCars.add(createCar(name.trim()));
        }
        return racingCars;
    }

    private Car createCar(String name) {
        return new Car(createCarName(name), new CarPosition());
    }

    private CarName createCarName(String name) {
        return new CarName(name);
    }

    public MovingNumber createMovingNumber() {
        try {
            return new MovingNumber(readMovingNumber());
        } catch (IllegalArgumentException e) {
            return createMovingNumber();
        }
    }
}
