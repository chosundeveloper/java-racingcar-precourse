package racingcar.car;

import java.util.Objects;

public class CarName {

    private String name;

    protected CarName() {}

    public CarName(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        validateEmptyName(name);
        validateNameLength(name);
    }

    private static void validateEmptyName(String name) {
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 null 이나 공백일 수 없습니다.");
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 넘을 수 없습니다.");
        }
    }

}
