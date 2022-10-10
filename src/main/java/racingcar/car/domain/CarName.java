package racingcar.car.domain;

import java.util.Objects;

public class CarName {

    private String name;

    protected CarName() {}

    public CarName(String name) {
        validate(name);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    private void validate(String name) {
        validateEmptyName(name);
        validateNameLength(name);
    }

    private static void validateEmptyName(String name) {
        if (Objects.isNull(name) || name.isEmpty()) {
            System.out.println("[ERROR] 자동차 이름은 null 이나 공백일 수 없습니다.");
            System.out.println();
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 null 이나 공백일 수 없습니다.");
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            System.out.println("[ERROR] 자동차 이름은 5자를 넘을 수 없습니다.");
            System.out.println();
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자를 넘을 수 없습니다.");
        }
    }

    public String name() {
        return this.name;
    }
}
