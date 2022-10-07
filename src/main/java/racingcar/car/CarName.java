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
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("상품명은 null 이나 공백일 수 없습니다.");
        }
    }

}
