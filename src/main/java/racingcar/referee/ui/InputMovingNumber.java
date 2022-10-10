package racingcar.referee.ui;

import camp.nextstep.edu.missionutils.Console;

public class InputMovingNumber {

    public static int readMovingNumber() {
        System.out.println("시도할 횟수는 몇회인가요?");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            return readMovingNumber();
        }
    }
}
