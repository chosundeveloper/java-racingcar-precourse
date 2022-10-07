package racingcar.car;

import java.util.Objects;

public class Position {

    private final int position;

    public Position() {
        this.position = 0;
    }

    public Position(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("자동차의 위치는 음수일 수 없습니다.");
        }
        this.position = position;
    }

    public int position () {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position that = (Position) o;
        return this.position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.position);
    }

    public Position move() {
        return new Position(this.position + 1);
    }

}

