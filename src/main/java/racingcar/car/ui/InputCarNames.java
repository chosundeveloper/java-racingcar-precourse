package racingcar.car.ui;

import camp.nextstep.edu.missionutils.Console;

public class InputCarNames {
    public static String[] readCarNames() {
        System.out.println("자동차 이름을 입력해주세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        System.out.println();
        return input.split(",");
    }
}
