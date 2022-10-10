package racingcar.car.domain;

public class MoveStrategy {
    public boolean movable(int randomNumber) {
        return randomNumber >= 4;
    }
}
