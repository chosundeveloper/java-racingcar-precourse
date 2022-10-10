package racingcar.referee.ui;

import camp.nextstep.edu.missionutils.Console;

public class InputMovingNumber {

    public static int readMovingNumber() {
        System.out.println("시도할 횟수는 몇회인가요?");
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해 주세요");
            System.out.println();
            return readMovingNumber();
        }
    }
}
