package racingcar.car;

public class Car {

    private final CarName carName;

    private CarPosition carPosition;

    public Car(CarName carName, CarPosition carPosition) {
        this.carName = carName;
        this.carPosition = carPosition;
    }

    public CarPosition carPosition() {
        return carPosition;
    }

    public void move(int number) {
        if (number >= 4 && number <= 9) {
            this.carPosition = this.carPosition.move();
        }
    }

}
