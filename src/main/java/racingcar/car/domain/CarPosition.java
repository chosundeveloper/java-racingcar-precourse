package racingcar.car.domain;

import java.util.Objects;

public class CarPosition implements Comparable<CarPosition> {

    private final int position;

    public CarPosition() {
        this.position = 0;
    }

    public CarPosition(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("자동차의 위치는 음수일 수 없습니다.");
        }
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPosition that = (CarPosition) o;
        return this.position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.position);
    }

    public CarPosition move() {
        return new CarPosition(this.position + 1);
    }

    @Override
    public int compareTo(CarPosition carPosition) {
        return Integer.compare(this.position, carPosition.position);
    }

    public int position() {
        return position;
    }
}

